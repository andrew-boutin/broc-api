package com.bakingbitsstudios.data;

import lombok.Builder;
import lombok.Value;

/**
 * A representation class. Otherwise known as POJO or data object.
 */
@Value
@Builder
public class Host {
    String id;

    String name;

    String self;

    String timeCreated;

    String timeUpdated;
}
