package com.btmatthews.alexa.adventure.handlers.impl;

import com.amazon.speech.slu.Intent;
import com.btmatthews.alexa.adventure.domain.Direction;
import com.btmatthews.alexa.adventure.services.LocationService;
import com.btmatthews.alexa.adventure.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DownIntentHandler extends AbstractMoveIntentHandler {

    @Autowired
    public DownIntentHandler(final PlayerService playerService,
                             final LocationService locationService) {
        super("DownIntent", playerService, locationService);
    }

    @Override
    public Direction resolveDirection(final Intent intent) {
        return Direction.DOWN;
    }
}

