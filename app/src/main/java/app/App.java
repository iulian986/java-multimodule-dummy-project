package app;

import config.ConfigService;
import util.Util;

public class App {

    public String greet(String name) {
        return Util.join("Hello ", name);
    }

    public boolean store(String name) {
        ConfigService configService = new ConfigService();
        configService.getConfig("datastore");
        return true;
    }
}