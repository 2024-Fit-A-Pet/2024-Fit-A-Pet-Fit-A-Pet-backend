package fitapet.backend.fit_a_pet.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtil {

    // Token 생성
    public static String createToken(String userEmail, String key, long expireTimeMs){
        Claims claims = Jwts.claims();
        claims.put("email",userEmail);

        return Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expireTimeMs))
                .signWith(SignatureAlgorithm.HS256, key)
                .compact();
    }

    // Key, Value를 통해 JWT 토큰의 Claims 속의 Value를 반환
    public static String getValue(String token,String secretKey, String key){
        Claims parsedClaims = parseToken(token, secretKey);
        return parsedClaims.get(key).toString();
    }

    // Token 만료 여부 확인
    public static boolean isExpired(String token, String secretKey){
        Date expiredDate = parseToken(token,secretKey).getExpiration();
        return expiredDate.before(new Date(System.currentTimeMillis()));
    }

    // Secret Key를 통해 Token Parsing
    private static Claims parseToken(String token, String secretKey){
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
    }
}
