package com.davidrus.shiokosho.services;

import com.davidrus.shiokosho.dto.Review;
import org.springframework.stereotype.Service;

/**
 * Created by david on 28-May-17.
 */
@Service
public interface ReviewService {

    boolean createReview(Review review);

    Review getReviewById(Long id);

    boolean updateReview(Review review);

    boolean deleteReview(Long id);

}
