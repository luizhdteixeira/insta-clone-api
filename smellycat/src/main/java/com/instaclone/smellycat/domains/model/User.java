package com.instaclone.smellycat.domains.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "TB_USER")
public class User implements Serializable {

    private static final long serialVersionUID = 8234477901280799296L;

    @Id
    @GeneratedValue
    @Column(name = "ID_USER", unique = true)
    private UUID uuid;
    @Column(name = "CD_USERNAME", unique = true)
    private String username;
    @Column(name = "NM_EMAIL", unique = true)
    private String email;
    @Column(name = "CD_PASSWORD")
    private String password;
    @Column(name = "CD_AVATAR")
    private String avatar;
    @CreationTimestamp
    @Column(name = "DT_CREATED")
    private LocalDate localDateCreated;
    @UpdateTimestamp
    @Column(name = "DT_UPDATED")
    private LocalDate localDateUpdated;

    public User() {
        super();
    }

    /* Created User */
    public User(String username, String email, String password, String avatar) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
    }

    /* Updated User */
    public User(String username, String email, String password, String avatar, LocalDate localDateCreated) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.localDateCreated = localDateCreated;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public LocalDate getLocalDateCreated() {
        return localDateCreated;
    }

    public void setLocalDateCreated(LocalDate localDateCreated) {
        this.localDateCreated = localDateCreated;
    }

    public LocalDate getLocalDateUpdated() {
        return localDateUpdated;
    }

    public void setLocalDateUpdated(LocalDate localDateUpdated) {
        this.localDateUpdated = localDateUpdated;
    }
}
