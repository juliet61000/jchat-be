package com.jchat.mem.mapper;

import com.jchat.mem.dto.ComOtherUser;
import com.jchat.mem.dto.SearchUserListResDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemFriendMapper {
    List<ComOtherUser> searchFriendList(Long userNo);
    List<SearchUserListResDto> searchFriends();
}
