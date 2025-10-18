package com.tf.tfcore.domain.assembler;

import com.tf.tfcore.domain.entity.UserDetailsEntity;
import com.tf.tfcore.dto.UserDetailsDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsAssembler {

    private ModelMapper modelMapper;

    public UserDetailsEntity toEntity(UserDetailsDTO userDetailsDTO) {

        return modelMapper.map(userDetailsDTO, UserDetailsEntity.class);

    }

    public UserDetailsDTO toDTO(UserDetailsEntity userDetailsEntity){

        return modelMapper.map(userDetailsEntity, UserDetailsDTO.class);

    }

}
