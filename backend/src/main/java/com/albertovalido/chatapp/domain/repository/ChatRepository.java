package com.albertovalido.chatapp.domain.repository;

import com.albertovalido.chatapp.domain.model.Chat;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ChatRepository extends ReactiveMongoRepository<Chat, String> {
}
