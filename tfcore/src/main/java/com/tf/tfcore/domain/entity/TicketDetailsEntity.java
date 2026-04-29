package com.tf.tfcore.domain.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TFC_TMS_TICKET_DETAILS")
@Inheritance(strategy = InheritanceType.JOINED)
@ToString
@EqualsAndHashCode(callSuper = false)
public class TicketDetailsEntity implements Serializable {

    @Id
    @Column(name = "ticket_id")
    private String ticketId;

    @Column(name = "ticket_description")
    private String ticketDescription;

    @Column(name = "ticket_details")
    private String ticketDetails;

    @Column(name = "assigned_from")
    private String assignedFrom;

    @Column(name = "assigned_to")
    private String assignedTo;

    @Column(name = "ticket_created_by")
    private String ticketCreatedBy;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "ticketId")
    private List<CommentDetailsEntity> commentsList;

}
