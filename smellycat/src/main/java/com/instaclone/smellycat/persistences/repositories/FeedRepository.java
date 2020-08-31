package com.instaclone.smellycat.persistences.repositories;

import com.instaclone.smellycat.persistences.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FeedRepository extends JpaRepository<Feed, UUID> {
}
