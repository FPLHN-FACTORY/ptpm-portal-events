package com.portalevent.infrastructure.repository;

import com.portalevent.entity.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SonPT
 */

@Repository(DivisionRepository.NAME)
public interface DivisionRepository extends JpaRepository<Division, String> {

    public static final String NAME = "BaseDivisionRepository";

}
