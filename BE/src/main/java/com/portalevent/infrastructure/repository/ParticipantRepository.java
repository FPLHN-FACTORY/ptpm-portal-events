package com.portalevent.infrastructure.repository;

import com.portalevent.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SonPT
 */

@Repository(ParticipantRepository.NAME)
public interface ParticipantRepository extends JpaRepository<Participant, String> {

    public static final String NAME = "BaseParticipantRepository";

}
