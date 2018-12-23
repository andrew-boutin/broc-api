package com.bakingbitsstudios;

import com.bakingbitsstudios.resources.HostService;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class BrocApiApp extends Application<BrocApiConfig> {

    @Override
    public void run(BrocApiConfig config, Environment env) {
        final HostService hostService = new HostService();
        env.jersey().register(hostService);

        env.healthChecks().register("template", new BrocApiCheck(config.getVersion()));
    }

    @Override
    public void initialize(final Bootstrap bootstrap) {
        // Have the app also serve up the Swagger UI
        final AssetsBundle assetsBundle = new AssetsBundle("/swagger-ui", "/swagger-ui", "index.html");
        bootstrap.addBundle(assetsBundle);
    }

    public static void main(String[] args) throws Exception {
        new BrocApiApp().run(args);
    }
}
