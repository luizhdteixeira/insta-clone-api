package com.instaclone.smellycat.dtos;

import com.instaclone.smellycat.persistences.Post;
import com.instaclone.smellycat.persistences.User;

import java.util.List;

public class FeedDTO {

    private User user;
    private List<Post> post;

    public FeedDTO() {
    }

    public FeedDTO(User user, List<Post> post) {
        this.user = user;
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }
}
