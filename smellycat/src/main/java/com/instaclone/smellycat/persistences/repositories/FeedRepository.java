package com.instaclone.smellycat.persistences.repositories;

import com.instaclone.smellycat.persistences.Feed;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FeedRepository extends JpaRepository<Feed, UUID> {
}
