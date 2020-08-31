package com.instaclone.smellycat.services;

import com.instaclone.smellycat.dtos.FeedDTO;
import com.instaclone.smellycat.persistences.User;

import java.util.Optional;

public interface FeedService {

    Optional<FeedDTO> getFeedByUser(User user);

}
