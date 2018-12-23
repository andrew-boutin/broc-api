package com.bakingbitsstudios;

import com.bakingbitsstudios.resources.HostService;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class BrocApiApp extends Application<BrocApiConfig> {

    @Override
    public void run(BrocApiConfig config, Environment env) {
        final HostService hostService = new HostService();
        env.jersey().register(hostService);

        env.healthChecks().register("template", new BrocApiCheck(config.getVersion()));
    }

    public static void main(String[] args) throws Exception {
        new BrocApiApp().run(args);
    }
}
