package com.albertovalido.chatapp.domain.model;


import com.albertovalido.chatapp.domain.model.enums.ChatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Set;

/**
 * Represents a chat in the application.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "chats")
public class Chat {

    @Id
    private String id;

    private String name;

    private Set<String> participantIds;

    private ChatType type;

    private Instant createdAt;

    private Instant lastMessageAt;
}
