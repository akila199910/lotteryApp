package com.example.lotteryApp.controller;

import com.example.lotteryApp.dto.PlayRequestDTO;
import com.example.lotteryApp.services.PlayService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/play")
public class PlayController {

    private final PlayService playService;

    public PlayController(PlayService playService) {
        this.playService = playService;
    }

    @PostMapping
    public ResponseEntity<?>playTicket(@Valid @RequestBody PlayRequestDTO request){

        System.out.println("Test");
        return ResponseEntity.status(HttpStatus.CREATED).body(playService.tryTicket(request));
    }
}
