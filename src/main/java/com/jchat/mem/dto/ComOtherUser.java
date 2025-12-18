package com.jchat.mem.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ComOtherUser {
    private Long userNo; // 친구 회원번호
    private String id; // 친구 아이디
    private String name; // 친구 이름
    private String aliasNm; // 친구 별칭
    private Integer birth; // 친구생일
    private String likeYn; // 즐겨찾기 여부
    private String blockYn; // 친구차단 여부
}
