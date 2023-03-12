package com.portalevent.entity;

import com.portalevent.entity.base.PrimaryEntity;
import com.portalevent.infrastructure.constant.EntityProperties;
import com.portalevent.infrastructure.constant.OrganizerStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.io.Serializable;

/**
 * @author SonPT
 */

@Getter
@Setter
@Table(name = "organizer")
@Entity
public class Organizer extends PrimaryEntity implements Serializable {

    @Column(length = EntityProperties.LENGTH_ACCOUNT, nullable = false)
    private String account;

    @Column(length = EntityProperties.LENGTH_EMAIL, nullable = false)
    private String email;

    @Column(length = EntityProperties.LENGTH_NAME, nullable = false)
    @Nationalized
    private String name;

    @Column(length = EntityProperties.LENGTH_PHONE)
    private String phoneNumber;

    @Column(nullable = false)
    private OrganizerStatus status;

}
