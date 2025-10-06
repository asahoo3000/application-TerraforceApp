package com.tf.tfcore.domain.assembler;

import com.tf.tfcore.domain.entity.UserDetailsEntity;
import com.tf.tfcore.dto.UserDetailsDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public UserDetailsEntity dtoToEntity(UserDetailsDTO userDetailsDTO) {

        UserDetailsEntity userDetailsEntity = modelMapper.map(userDetailsDTO, UserDetailsEntity.class);
        return userDetailsEntity;

    }

    public UserDetailsDTO entityToDTO(UserDetailsEntity userDetailsEntity){

        UserDetailsDTO userDetailsDTO = modelMapper.map(userDetailsEntity, UserDetailsDTO.class);
        return userDetailsDTO;

    }

}
