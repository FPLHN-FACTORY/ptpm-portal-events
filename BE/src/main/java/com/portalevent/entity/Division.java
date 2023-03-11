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
@Table(name = "division")
@Entity
public class Division extends PrimaryEntity implements Serializable {

    @Column(length = EntityProperties.LENGTH_ID)
    private String todoId;

    @Column(length = EntityProperties.LENGTH_ID)
    private String eventId;

}
