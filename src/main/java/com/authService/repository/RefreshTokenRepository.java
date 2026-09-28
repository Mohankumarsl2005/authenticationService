package com.authService.repository;

import com.authService.entity.RefreshToken;
import java.util.Optional;

public interface RefreshTokenRepository
        extends CurdRepository<RefreshToken, Integer> {

    Optional<RefreshToken> findByToken(String token);
}