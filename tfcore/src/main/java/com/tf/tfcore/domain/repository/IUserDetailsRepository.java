package com.tf.tfcore.domain.repository;

import com.tf.tfcore.domain.entity.UserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDetailsRepository extends JpaRepository<UserDetailsEntity, String> {

}
