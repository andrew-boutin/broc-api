package com.bakingbitsstudios;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

@Getter
@Setter
public class BrocApiConfig extends Configuration {
    // TODO: What's this version actually for? Maps to config.yml in root of repo
    @NotEmpty
    @JsonProperty
    private String version;
}