package controller;

import io.dropwizard.core.Configuration;

public class MyConfiguration extends Configuration {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

}
