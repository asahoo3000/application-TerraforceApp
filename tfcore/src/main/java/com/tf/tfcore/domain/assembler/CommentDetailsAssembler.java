package com.tf.tfcore.domain.assembler;

import com.tf.tfcore.domain.entity.CommentDetailsEntity;
import com.tf.tfcore.dto.CommentDetailsDTO;
import org.modelmapper.ModelMapper;

public class CommentDetailsAssembler {

    private ModelMapper modelMapper;

    public CommentDetailsEntity toEntity(CommentDetailsDTO ticketDetailsDTO) {

        return modelMapper.map(ticketDetailsDTO, CommentDetailsEntity.class);

    }

    public CommentDetailsDTO toDTO(CommentDetailsEntity ticketDetailsEntity){

        return modelMapper.map(ticketDetailsEntity, CommentDetailsDTO.class);

    }

}
