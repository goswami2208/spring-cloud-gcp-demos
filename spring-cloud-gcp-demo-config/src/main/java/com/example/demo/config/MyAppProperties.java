package com.example.demo.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@ConfigurationProperties("myapp")
public class MyAppProperties {

    private int queueSize;

    private boolean isFeatureXEnabled;

    public int getQueueSize() {
        return this.queueSize;
    }

    public void setQueueSize(int size) {
        this.queueSize = size;
    }

    public boolean isFeatureXEnabled() {
        return this.isFeatureXEnabled;
    }

    public void setFeatureXEnabled(boolean featureXEnabled) {
        this.isFeatureXEnabled = featureXEnabled;
    }
}
