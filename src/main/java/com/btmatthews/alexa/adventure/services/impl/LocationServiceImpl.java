package com.btmatthews.alexa.adventure.services.impl;

import com.btmatthews.alexa.adventure.domain.Location;
import com.btmatthews.alexa.adventure.services.LocationService;

import java.util.Collections;

public class LocationServiceImpl implements LocationService {

    @Override
    public Location getLocation(String locationId) {
        return new Location(
                locationId,
                "Dark Room",
                "The room is dark",
                Collections.singletonList("P1"),
                Collections.emptyList(),
                Collections.emptyList(),
                Collections.emptyMap());
    }
}
