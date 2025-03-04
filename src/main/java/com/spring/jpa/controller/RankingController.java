package com.spring.jpa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

/*
@CrossOrigin(origins ="{*}", maxAge = 6000)
@RestController
@RequiredArgsConstructor
@RequestMapping("ranking")
public class RankingController {
    
    final RankingService rankingService;

    //특정 게스트 하우스의 TOP3 랭킹 조회
    @GetMapping("/top3/{guestHouseId}")
    public ResponseEntity<?> getTop3Ranking(@PathVariable Long guestHouseId) throws Exception {
        return new ResponseEntity<>(rankingService.getTop3Ranking(guestHouseId), HttpStatus.OK);
    }

    //특정 유저의 게임 기록 조희
    @GetMapping("/userRank/{userId}")
    public ResponseEntity<?> getUserRanking(@PathVariable Long userId) throws Exception {
        return new ResponseEntity<>(rankingService.getUserRanking(userId), HttpStatus.OK);
    }


}
*/