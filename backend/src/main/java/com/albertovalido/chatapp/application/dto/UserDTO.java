package com.albertovalido.chatapp.application.dto;

import lombok.Data;

import java.time.Instant;
import java.util.Set;

/**
 * DTO for user.
 */

@Data
public class UserDTO {

    private String id;

    private String username;

    private String email;

    private Instant createdAt;

    private String status;

    private String avatarUrl;

    private Set<String> chatsIds;
}
