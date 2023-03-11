package com.portalevent.entity;

import com.portalevent.entity.base.PrimaryEntity;
import com.portalevent.infrastructure.constant.EntityProperties;
import com.portalevent.infrastructure.constant.EventStatus;
import com.portalevent.infrastructure.constant.Formality;
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
@Table(name = "event")
@Entity
public class Event extends PrimaryEntity implements Serializable {

    @Column(length = EntityProperties.LENGTH_ID)
    private String approverId;

    @Column(length = EntityProperties.LENGTH_ID)
    private String eventGroupId;

    @Column(length = EntityProperties.LENGTH_ID)
    private String categoryId;

    @Column(length = EntityProperties.LENGTH_ID, nullable = false)
    private String organizerId;

    @Column(length = EntityProperties.LENGTH_NAME)
    private String name;

    @Column(nullable = false)
    private Long startTime;

    @Column(nullable = false)
    private Long endTime;

    @Column(nullable = false)
    private Formality formality;

    @Column
    private String location;

    @Column
    private EventStatus status;

}
