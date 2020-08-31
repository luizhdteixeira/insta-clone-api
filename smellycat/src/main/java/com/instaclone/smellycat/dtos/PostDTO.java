package com.instaclone.smellycat.dtos;

import com.instaclone.smellycat.persistences.Feed;
import com.instaclone.smellycat.persistences.User;

public class PostDTO {

    private User user;
    private Feed feed;

    public PostDTO() {
    }

    public PostDTO(User user, Feed feed) {
        this.user = user;
        this.feed = feed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }
}
