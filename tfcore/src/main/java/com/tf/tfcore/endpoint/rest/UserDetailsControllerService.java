package com.tf.tfcore.endpoint.rest;


import com.tf.tfcore.dto.UserDetailsDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserDetailsControllerService {

    public void getAllUserDetails() {
        // TODO document why this method is empty
    }

    public void getUserDetails(UserDetailsDTO userDTO) {

    }

    public void addNewUserDetails(UserDetailsDTO userDTO) {

    }

}
