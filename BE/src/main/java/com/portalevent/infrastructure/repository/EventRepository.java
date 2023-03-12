package com.portalevent.infrastructure.repository;

import com.portalevent.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SonPT
 */

@Repository(EventRepository.NAME)
public interface EventRepository extends JpaRepository<Event, String> {

    public static final String NAME = "BaseEventRepository";

}
