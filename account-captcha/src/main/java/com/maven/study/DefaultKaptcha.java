package com.maven.study;

import java.awt.image.BufferedImage;

/**
 * Created by yuanyouz on 2017/6/11.
 */
public class DefaultKaptcha {
    private Config config;

    public void setConfig(Config config) {
        this.config = config;
    }

    public Config getConfig() {
        return config;
    }

    public String createText() {
        return null;
    }

    public BufferedImage createImage(String text) {
        return null;
    }
}
