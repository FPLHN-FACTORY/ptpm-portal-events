package com.portalevent.infrastructure.repository;

import com.portalevent.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SonPT
 */

@Repository(FeedbackRepository.NAME)
public interface FeedbackRepository extends JpaRepository<Feedback, String> {

    public static final String NAME = "BaseFeedbackRepository";

}
