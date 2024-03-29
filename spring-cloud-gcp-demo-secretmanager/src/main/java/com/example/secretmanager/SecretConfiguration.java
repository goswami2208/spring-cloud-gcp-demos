package com.example.secretmanager;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@ConfigurationProperties("application")
@RefreshScope
public class SecretConfiguration {

    private String secret;

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }
}