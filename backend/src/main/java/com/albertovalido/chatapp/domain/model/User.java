package com.albertovalido.chatapp.domain.model;

import com.albertovalido.chatapp.domain.model.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Set;


/**
 * Represents a user in the application.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String username;

    private String email;

    private String passwordHash;

    private Instant createdAt;

    private UserStatus status;

    private String avatarUrl;

    private Set<String> chatsIds;
}
