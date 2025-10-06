package com.tf.tfcore.domain.repository;

import com.tf.tfcore.domain.entity.TicketDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITicketDetailsRepository extends JpaRepository<TicketDetailsEntity, String> {

}
