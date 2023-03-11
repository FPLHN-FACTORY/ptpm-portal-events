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
@Table(name = "organizer")
@Entity
public class Organizer extends PrimaryEntity implements Serializable {

    @Column(length = EntityProperties.LENGTH_ACCOUNT)
    private String account;

    @Column(length = EntityProperties.LENGTH_EMAIL)
    private String email;

    @Column(length = EntityProperties.LENGTH_NAME)
    private String name;

    @Column(length = EntityProperties.LENGTH_PHONE)
    private String phoneNumber;

}
