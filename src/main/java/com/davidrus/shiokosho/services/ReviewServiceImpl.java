package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dao.ReviewDao;
import com.davidrus.shiokosho.dto.Review;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by david on 28-May-17.
 */
@Service
@Slf4j
public class ReviewServiceImpl implements ReviewService{

    @Resource
    private Mapper mapper;

    @Resource
    private ReviewDao reviewDao;

    @Override
    public boolean createReview(Review review) {
        com.davidrus.shiokosho.domain.Review reviewDomain = mapper.map(review, com.davidrus.shiokosho.domain.Review.class);
        return reviewDao.createReview(reviewDomain);
    }

    @Override
    public Review getReviewById(Long id) {
        com.davidrus.shiokosho.domain.Review reviewDomain = reviewDao.getReviewById(id);
        Review reviewDto = mapper.map(reviewDomain, Review.class);
        return reviewDto;
    }

    @Override
    public boolean updateReview(Review review) {
        com.davidrus.shiokosho.domain.Review reviewDomain = mapper.map(review, com.davidrus.shiokosho.domain.Review.class);
        return reviewDao.updateReview(reviewDomain);
    }

    @Override
    public boolean deleteReview(Long id) {
        return reviewDao.deleteReview(id);
    }
}
