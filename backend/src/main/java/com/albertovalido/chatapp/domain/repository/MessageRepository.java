package com.albertovalido.chatapp.domain.repository;

import com.albertovalido.chatapp.domain.model.Message;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MessageRepository extends ReactiveMongoRepository<Message, String> {
}
