package com.tf.tfcore.endpoint.rest;


import com.tf.tfcore.app.service.UserDetailsApplicationService;
import com.tf.tfcore.domain.entity.UserDetailsEntity;
import com.tf.tfcore.dto.UserDetailsDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserDetailsControllerService {

    public final UserDetailsApplicationService applicationService;

    public UserDetailsControllerService(UserDetailsApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    public void getAllUserDetails() {

    }

    public void getUserDetails(UserDetailsDTO userDTO) {

    }

    @PostMapping("/addUser")
    public ResponseEntity<UserDetailsEntity> addNewUserDetails(UserDetailsDTO userDTO) {

    return null;
    }

}
