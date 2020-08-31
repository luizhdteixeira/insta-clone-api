package com.instaclone.smellycat.persistences.mappers;

import com.instaclone.smellycat.dtos.FeedDTO;
import com.instaclone.smellycat.persistences.Feed;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FeedMapper {

    FeedDTO feedDTOFromModel(Feed feed);
    List<FeedDTO> feedDTOsFromModels(List<Feed> feed);
}
