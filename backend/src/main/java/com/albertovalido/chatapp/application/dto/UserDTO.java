package com.albertovalido.chatapp.application.dto;

import lombok.Data;

import java.time.Instant;
import java.util.Set;

@Data
public class UserDTO {

    private String id;

    private String username;

    private String email;

    private String passwordHash;

    private Instant createdAt;

    private String status;

    private String avatarUrl;

    private Set<String> chatsIds;
}
