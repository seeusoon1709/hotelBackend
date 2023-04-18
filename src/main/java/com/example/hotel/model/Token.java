package com.example.hotel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "token")
public class Token {

    @Id
    private String id;
    private String userId;
    private String token;
    private TokenType tokrnType;
    private boolean revoked;
    private boolean expired;

}
