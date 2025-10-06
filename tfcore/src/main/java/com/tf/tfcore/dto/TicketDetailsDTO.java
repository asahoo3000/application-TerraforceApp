package com.tf.tfcore.dto;


import com.tf.tfcore.domain.entity.CommentDetailsEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class TicketDetailsDTO implements Serializable {

    private String ticketId;

    private String ticketDescription;

    private String ticketDetails;

    private String assignedFrom;

    private String assignedTo;

    private String ticketCreatedBy;

    private List<CommentDetailsEntity> commentsList;

}
