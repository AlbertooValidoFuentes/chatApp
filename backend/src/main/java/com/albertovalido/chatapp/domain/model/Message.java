package com.albertovalido.chatapp.domain.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "messages")
public class Message {

    @Id
    private String id;

    private String chatId;

    private String senderId;

    private String content;

    private Instant sendAt;

    private Instant editedAt;

    private String status;
}
