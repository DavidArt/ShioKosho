package com.davidrus.shiokosho.dao;

import com.davidrus.shiokosho.domain.Review;
import org.springframework.stereotype.Repository;

/**
 * Created by david on 26-May-17.
 */
@Repository
public interface ReviewDao {

    boolean createReview(Review review);

    Review getReviewById(Long id);

    boolean updateReview(Review review);

    boolean deleteReview(Long id);

}
