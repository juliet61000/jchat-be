package com.jchat.mem.controller;

import com.jchat.common.context.UserContext;
import com.jchat.mem.service.MemFriendService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/mem/friend")
public class MemFriendController {

    private final MemFriendService memFriendService;

    @GetMapping("/list")
    public ResponseEntity<?> searchFriendList() {

        if (!UserContext.hasUser()) {
            return ResponseEntity.status(401)
                .body(Map.of("code", 401, "message", "No refresh token"));}

        return ResponseEntity.ok(memFriendService.searchFriendList(UserContext.getUserNo()));
    }

}
