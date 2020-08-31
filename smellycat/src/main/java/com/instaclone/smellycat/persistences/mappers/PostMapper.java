package com.instaclone.smellycat.persistences.mappers;

import com.instaclone.smellycat.dtos.PostDTO;
import com.instaclone.smellycat.persistences.Post;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PostMapper {

    PostDTO postDTOFromModel(Post post);
    List<PostDTO> postDTOsFromModels(List<Post> posts);
}
