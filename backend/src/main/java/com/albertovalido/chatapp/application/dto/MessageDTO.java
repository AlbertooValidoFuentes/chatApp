package com.albertovalido.chatapp.application.dto;

import lombok.Data;

import java.time.Instant;

@Data
public class MessageDTO {

    private String id;

    private String chatId;

    private String senderId;

    private String content;

    private Instant sendAt;

    private Instant editedAt;

    private String status;
}
