package com.portalevent.entity;

import com.portalevent.entity.base.PrimaryEntity;
import com.portalevent.infrastructure.constant.EntityProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author SonPT
 */

@Getter
@Setter
@Table(name = "participant")
@Entity
public class Participant extends PrimaryEntity implements Serializable {

    @Column(length = EntityProperties.LENGTH_ID, nullable = false)
    private String eventId;

    @Column(length = EntityProperties.LENGTH_ID, nullable = false)
    private String participantId;

    @Column
    private Byte randomNumber;

    @Column
    private Long attendanceTime;

}
