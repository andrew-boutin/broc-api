package com.bakingbitsstudios.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * A representation class. Otherwise known as POJO or data object.
 */
@Getter
@AllArgsConstructor
public class Host {
    // TODO: Builder annotation

    @JsonProperty
    private String id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String self;

    @JsonProperty
    private String timeCreated;

    @JsonProperty
    private String timeUpdated;

    public Host() {
        // Jackson deserialization
    }
}
