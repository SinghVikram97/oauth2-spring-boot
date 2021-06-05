package com.example.oauth2springboot.controllers;

import com.example.oauth2springboot.Token;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TokenController {

    @PostMapping("token")
    @PreAuthorize("hasRole('ROLE_USER')")
    public Token getToken(HttpServletRequest request){

       String authorization=request.getHeader("Authorization");
       String base64Credentials=authorization.substring("Basic".length()).trim();
       byte[] credDecoded= Base64.getDecoder().decode(base64Credentials);
       String credentials=new String(credDecoded, StandardCharsets.UTF_8);
       final String[] values=credentials.split(":",2);

       String username=values[0];

       String token=getJwtToken(username);

       return new Token(token);
    }

    private String getJwtToken(String username){
        String secretKey="mySecretKey";
        List<GrantedAuthority> grantedAuthorities= AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

        String token= Jwts.builder()
                .setId("myJWT")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+600000))
                .signWith(SignatureAlgorithm.HS512,secretKey.getBytes()).compact();

        return "Bearer "+token;
    }

}
