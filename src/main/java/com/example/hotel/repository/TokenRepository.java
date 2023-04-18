package com.example.hotel.repository;

import com.example.hotel.model.Token;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends MongoRepository<Token, String > {
    List<Token> findAllValidTokenByUser(Integer id);

    Optional<Token> findByToken(String token);
}
