package com.instaclone.smellycat.services;

import com.instaclone.smellycat.dtos.PostDTO;
import com.instaclone.smellycat.persistences.Post;
import com.instaclone.smellycat.persistences.User;

import java.util.List;
import java.util.Optional;

public interface PostService {

    Optional<PostDTO> getPostByUser(User user);
    List<PostDTO> getPosts();
    Optional<PostDTO> createPost(Post post);
}
