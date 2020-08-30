package com.instaclone.smellycat.persistences.repositories;

import com.instaclone.smellycat.persistences.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
