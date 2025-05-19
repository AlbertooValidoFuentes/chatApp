package com.albertovalido.chatapp.application.dto;

import lombok.Data;

import java.time.Instant;
import java.util.Set;

/**
 * DTO for chat
 */
@Data
public class ChatDTO {

    private String id;

    private String name;

    private Set<String> participantIds;

    private String type;

    private Instant createdAt;

    private Instant lastMessageAt;
}
