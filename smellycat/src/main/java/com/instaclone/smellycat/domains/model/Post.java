package com.instaclone.smellycat.domains.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "TB_POST")
public class Post implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID_POST", unique = true)
    private UUID uuid;
    @Column(name = "TX_CONTENT")
    private String content;
    @Column(name = "NR_ASPECT_RATIO")
    private Long aspectRatio;
    @Column(name = "NM_IMAGE")
    private String image;
    @Column(name = "NM_IMAGE_SMALL")
    private String imageSmall;
    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "ID_USER")
    private User user;

    public Post() {
        super();
    }

    /* Created Post*/
    public Post(String content, Long aspectRatio, String image, String imageSmall, User user) {
        this.content = content;
        this.aspectRatio = aspectRatio;
        this.image = image;
        this.imageSmall = imageSmall;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Long aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageSmall() {
        return imageSmall;
    }

    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall;
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
