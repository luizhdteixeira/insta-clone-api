package com.instaclone.smellycat.persistences.repositories;

import com.instaclone.smellycat.persistences.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
}
