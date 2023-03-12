package com.portalevent.infrastructure.repository;

import com.portalevent.entity.Approver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author SonPT
 */

@Repository(ApproverRepository.NAME)
public interface ApproverRepository extends JpaRepository<Approver, String> {
    public static final String NAME = "BaseApproverRepository";


}
