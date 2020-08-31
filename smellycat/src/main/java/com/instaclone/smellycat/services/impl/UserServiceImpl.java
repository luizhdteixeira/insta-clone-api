package com.instaclone.smellycat.services.impl;

import com.instaclone.smellycat.dtos.UserDTO;
import com.instaclone.smellycat.persistences.User;
import com.instaclone.smellycat.persistences.mappers.UserMapper;
import com.instaclone.smellycat.persistences.repositories.UserRepository;
import com.instaclone.smellycat.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Objects.nonNull;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    @Override
    public UserDTO getUserByEmail(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isPresent()) {
            return userMapper.userDTOFromModel(user.get());
        } else {
            return new UserDTO();
        }
    }

    @Override
    public List<UserDTO> getUsers() {
        List<User> users = userRepository.findAll();
        if (nonNull(users)) {
            return userMapper.userDTOsFromModels(users);
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void createUser(UserDTO userDTO) {
        if (nonNull(userDTO))
            userRepository.save(userMapper.userFromDTO(userDTO));
    }
}
