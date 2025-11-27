package com.jchat.mem.service;

import com.jchat.mem.dto.SearchUserReqDto;
import com.jchat.mem.dto.SearchUserResDto;
import org.springframework.stereotype.Component;

@Component
public class MemService {
    public SearchUserResDto searchUser(SearchUserReqDto reqDto) {

        SearchUserResDto resDto = new SearchUserResDto();

        if ("juliet61008".equals(reqDto.getId())) {
            resDto.setId("juliet61008");
            resDto.setName("한재경");
        } else {
            resDto.setId("who");
            resDto.setName("누구");
        }

        return resDto;
    }
}
