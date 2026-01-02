package com.jchat.chat.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 채팅방 조회 REQ DTO
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SearchChatRoomListResDto {
    // 채팅방 번호
    private Long roomId;

    // 채팅방 이름
    private String roomName;

    // 노출 채팅방 이름
    private String expoRoomName;

    // 채팅방 코드
    private String roomCd;

    // 츨겨찾기 여부
    private String likeYn;
}
