package com.instaclone.smellycat.persistences;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
public class Feed implements Serializable {

    @Id
    @GeneratedValue
    private UUID uuid;
    @OneToOne
    private User user;
    @OneToMany
    private List<Post> post;

    public Feed() {
    }

    public Feed(User user, List<Post> post) {
        this.post = post;
        this.user = user;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
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
