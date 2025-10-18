package com.tf.tfcore.domain.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tf_user_details")
@Inheritance(strategy = InheritanceType.JOINED)
@ToString
@EqualsAndHashCode(callSuper = false)
public class UserDetailsEntity implements Serializable {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "is_active")
    private Boolean isActive;

}
