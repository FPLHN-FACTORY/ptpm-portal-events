package com.portalevent.entity;

import com.portalevent.entity.base.PrimaryEntity;
import com.portalevent.infrastructure.constant.EntityProperties;
import com.portalevent.infrastructure.constant.TodoStatus;
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
@Table(name = "todo")
@Entity
public class Todo extends PrimaryEntity implements Serializable {

    @Column(length = EntityProperties.LENGTH_ID, nullable = false)
    private String eventId;

    @Column(length = EntityProperties.LENGTH_CODE, nullable = false)
    private String code;

    @Column(length = EntityProperties.LENGTH_NAME)
    private String name;

    @Column
    private Long startTime;

    @Column
    private Long endTime;

    @Column
    private TodoStatus status;

    @Column(length = EntityProperties.LENGTH_DESCRIPTION)
    private String description;

}
