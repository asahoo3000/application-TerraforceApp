package com.tf.tfcore.domain.assembler;

import com.tf.tfcore.domain.entity.TicketDetailsEntity;
import com.tf.tfcore.dto.TicketDetailsDTO;
import org.modelmapper.ModelMapper;

public class TicketDetailsAssembler {

    private ModelMapper modelMapper;

    public TicketDetailsEntity toEntity(TicketDetailsDTO ticketDetailsDTO) {

        return modelMapper.map(ticketDetailsDTO, TicketDetailsEntity.class);

    }

    public TicketDetailsDTO toDTO(TicketDetailsEntity ticketDetailsEntity){

        return modelMapper.map(ticketDetailsEntity, TicketDetailsDTO.class);

    }

}
