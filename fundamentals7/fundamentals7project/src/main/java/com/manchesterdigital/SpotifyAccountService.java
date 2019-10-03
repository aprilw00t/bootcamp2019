package com.manchesterdigital;

public class SpotifyAccountService {
    public SpotifyAccount verify(String username, String password) {

        return new SpotifyAccount(username, password);
    }
}
