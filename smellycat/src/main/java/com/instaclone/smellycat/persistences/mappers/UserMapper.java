package com.instaclone.smellycat.persistences.mappers;

import com.instaclone.smellycat.dtos.UserDTO;
import com.instaclone.smellycat.persistences.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO userDTOFromModel(User user);
    List<UserDTO> userDTOsFromModels(List<User> users);
    User userFromDTO(UserDTO userDTO);

}
