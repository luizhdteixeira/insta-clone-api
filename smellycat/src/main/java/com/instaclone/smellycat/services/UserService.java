package com.instaclone.smellycat.services;

import com.instaclone.smellycat.dtos.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO getUserByEmail(String email);
    List<UserDTO> getUsers();
    void createUser(UserDTO userDTO);

}
