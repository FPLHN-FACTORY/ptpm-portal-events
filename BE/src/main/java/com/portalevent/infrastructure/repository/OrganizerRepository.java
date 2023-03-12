package com.portalevent.infrastructure.repository;

import com.portalevent.entity.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SonPT
 */

@Repository(OrganizerRepository.NAME)
public interface OrganizerRepository extends JpaRepository<Organizer, String> {

    public static final String NAME = "BaseOrganizerRepository";

}
