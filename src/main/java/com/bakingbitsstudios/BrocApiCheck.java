package com.bakingbitsstudios;

import com.codahale.metrics.health.HealthCheck;

public class BrocApiCheck extends HealthCheck {
    private final String version;

    public BrocApiCheck(String version) {
        this.version = version;
    }

    @Override
    protected Result check() throws Exception {
        // TODO: Can check things like DB connections etc.
        return Result.healthy(version);
    }
}
