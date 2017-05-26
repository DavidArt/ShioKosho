package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.Review;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 * Created by david on 26-May-17.
 */
@Repository
@Slf4j
public class ReviewDaoImpl implements ReviewDao {

    @PersistenceContext
    public EntityManager em;

    @Override
    @Transactional
    public boolean createReview(Review review) {
        em.persist(review);

        return true;
    }

    @Override
    public Review getReviewById(Long id) {
        TypedQuery<Review> query = em.createNamedQuery(Review.GET_REVIEW_BY_ID, Review.class);
        query.setParameter("id", id);

        return query.getSingleResult();
    }

    @Override
    @Transactional
    public boolean updateReview(Review review) {
        em.merge(review);

        return true;
    }

    @Override
    @Transactional
    public boolean deleteReview(Long id) {
        TypedQuery<Review> query = em.createNamedQuery(Review.GET_REVIEW_BY_ID, Review.class);
        query.setParameter("id", id);
        Review review = query.getSingleResult();
        em.remove(review);

        return true;
    }
}
