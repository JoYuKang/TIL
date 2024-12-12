package com.gen.prepractice.config.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class JwtDto {
    String grantType;
    String accessToken;
    String refreshToken;
    Long accessTokenExpiresIn;
}
