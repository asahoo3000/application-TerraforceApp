package com.tf.tfcore.domain.service;

import com.tf.tfcore.domain.assembler.UserDetailsAssembler;
import com.tf.tfcore.domain.repository.IUserDetailsRepository;
import com.tf.tfcore.dto.UserDetailsDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserDetailsDomainService {

    @Autowired
    IUserDetailsRepository userDetailsRepository;

    @Autowired
    private UserDetailsAssembler userDetailsAssembler;

    public void save(UserDetailsDTO userDetailsDTO) {

        try {
            userDetailsRepository.save(userDetailsAssembler.dtoToEntity(userDetailsDTO));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
