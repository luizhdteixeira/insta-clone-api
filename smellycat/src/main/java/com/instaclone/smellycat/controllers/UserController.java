package com.instaclone.smellycat.controllers;

import com.instaclone.smellycat.dtos.UserDTO;
import com.instaclone.smellycat.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/{email}/user", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserDTO> getUserByEmail(@PathVariable String email) {
        if (StringUtils.isEmpty(email)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        UserDTO userDTO = userService.getUserByEmail(email);
        if (Objects.nonNull(userDTO)) {
            return new ResponseEntity<>(userDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping(path = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<List<UserDTO>> getUsers() {
        List<UserDTO> userDTO = userService.getUsers();
        if (Objects.nonNull(userDTO)) {
            return new ResponseEntity<>(userDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> createUser(UserDTO userDTO) {
        if (Objects.nonNull(userDTO)) {
            userService.createUser(userDTO);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


}
