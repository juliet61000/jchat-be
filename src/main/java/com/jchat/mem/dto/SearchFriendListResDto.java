package com.jchat.mem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 목록 조회 user
 */
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SearchFriendListResDto {
    private Long myUserNo;

    private List<ComOtherUser> friendList;
}