package com.bakingbitsstudios.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A representation class. Otherwise known as POJO or data object.
 */
public class Host {
    // TODO: Lombok
    // TODO: Builder annotation
    private String id;
    private String name;
    private String self;
    private String timeCreated;
    private String timeUpdated;

    public Host() {

    }

    public Host(String id, String name, String self, String timeCreated, String timeUpdated) {
        this.id = id;
        this.name = name;
        this.self = self;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    // These allow Jackson to serialize and de-serialize from JSON.
    @JsonProperty
    public String getId() {
        return id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public String getSelf() {
        return self;
    }

    @JsonProperty
    public String getTimeCreated() {
        return timeCreated;
    }

    @JsonProperty
    public String getTimeUpdated() {
        return timeUpdated;
    }
}
