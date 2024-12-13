package com.jpa.demo.Entity;


import java.util.List;
import java.util.Date;


import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenProvider {
    private final String SECRET_KEY = "your_secret_key";
    private final long EXPIRATION_TIME = 86400000; // 1 day in milliseconds

    public String generateToken(String username, List<String> roles) {
        return Jwts.builder()
                   .setSubject(username)
                   .claim("roles", roles)
                   .setIssuedAt(new Date())
                   .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                   .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                   .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getUsernameFromToken(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody().getSubject();
    }
}
