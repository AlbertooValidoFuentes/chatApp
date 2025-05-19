package com.albertovalido.chatapp.application.dto;

import com.albertovalido.chatapp.domain.model.enums.MessageStatus;
import lombok.Data;

import java.time.Instant;

/**
 * DTO for message.
 */
@Data
public class MessageDTO {

    private String id;

    private String chatId;

    private String senderId;

    private String content;

    private Instant sendAt;

    private Instant editedAt;

    private MessageStatus status;
}
