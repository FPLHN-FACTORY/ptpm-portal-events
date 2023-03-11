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
@Table(name = "feedback")
@Entity
public class Feedback extends PrimaryEntity implements Serializable {

    @Column(length = EntityProperties.LENGTH_ID, nullable = false)
    private String eventId;

    @Column(length = EntityProperties.LENGTH_DESCRIPTION)
    private String comment;

    @Column
    private Byte rate;

}
