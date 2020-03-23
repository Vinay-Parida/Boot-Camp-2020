package com.example.SpringSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Request;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AppController {

    @Autowired
    private TokenStore tokenStore;

    @GetMapping("/dpLogout")
    public String logout(HttpServletRequest request){
        String authHeader = request.getHeader("Authorization");
        if(authHeader!= null){
            String tokenValue = authHeader.replace("Bearer","").trim();
            OAuth2AccessToken accessToken = tokenStore.readAccessToken(tokenValue);
            tokenStore.removeAccessToken(accessToken);
        }
        return "Logged out successfully";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/admin")
    public String adminHome(){
        return "Admin Home";
    }

    @GetMapping("/user")
    public String userHome(){
        return "User Home";
    }

}

