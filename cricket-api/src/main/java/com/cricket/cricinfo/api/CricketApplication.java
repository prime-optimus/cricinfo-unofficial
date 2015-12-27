package com.cricket.cricinfo.api;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class CricketApplication extends ResourceConfig {
    public CricketApplication() {
        packages("com.cricket.cricinfo.api");
    }
}