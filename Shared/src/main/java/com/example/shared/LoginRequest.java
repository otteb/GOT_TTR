package com.example.shared;

/**
 * Created by fjameson on 2/2/18.
 */

public class LoginRequest {
    private String username;
    private String password;
    public LoginRequest(String u, String p){
        username=u;
        password=p;
    }

    public String getUsername(){ return username;}
    public String getPassword() { return password;}
}
