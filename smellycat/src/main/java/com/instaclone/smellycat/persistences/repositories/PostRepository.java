package com.instaclone.smellycat.persistences.repositories;

import com.instaclone.smellycat.persistences.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {
}
