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
@Table(name = "TFC_TMS_COMMENT_DETAILS")
@Inheritance(strategy = InheritanceType.JOINED)
@ToString
@EqualsAndHashCode(callSuper = false)
public class CommentDetailsEntity implements Serializable {

    @Id
    @Column(name = "comment_id")
    private String commentId;

    @Column(name = "comment")
    private String comment;

    @Column(name = "comment_given_by")
    private String commentGivenBy;

    @Column(name = "ticket_id")
    private String ticketId;

}
