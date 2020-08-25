package com.instaclone.smellycat.domains;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private UUID uuid;
    @OneToOne
    private User user;
    @ManyToOne
    private Feed feed;

    public Post() {
    }

    public Post(User user, Feed feed) {
        this.user = user;
        this.feed = feed;
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

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return uuid.equals(post.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
