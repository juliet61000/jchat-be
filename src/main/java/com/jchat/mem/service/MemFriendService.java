package com.jchat.mem.service;

import com.jchat.mem.dto.*;
import com.jchat.mem.mapper.MemFriendMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemFriendService {

    private final MemFriendMapper memFriendMapper;

    /**
     * 회원정보조회
     * @param {{@link SearchUserReqDto}} reqDto
     * @return {{@link SearchUserResDto}} resDto
     */
    public List<SearchUserListResDto> searchUserList(SearchUserListReqDto reqDto) {



        return null;
    }

    /**
     * @param {{@link Long} userNo 회원번호
     * @param userNo
     */
    public SearchFriendListResDto searchFriendList(Long userNo) {

        List<ComOtherUser> comOtherUser = memFriendMapper.searchFriendList(userNo);

        return SearchFriendListResDto.builder()
                .myUserNo(userNo)
                .friendList(comOtherUser)
                .build();
    }

}
