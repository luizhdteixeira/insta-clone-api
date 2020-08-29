package com.instaclone.smellycat.domains.repositories;

import com.instaclone.smellycat.domains.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
