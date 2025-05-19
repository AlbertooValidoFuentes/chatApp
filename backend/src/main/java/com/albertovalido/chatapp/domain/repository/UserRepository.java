package com.albertovalido.chatapp.domain.repository;

import com.albertovalido.chatapp.domain.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
