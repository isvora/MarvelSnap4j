package org.isvora.snap;

import org.isvora.snap.model.Card;
import org.isvora.snap.model.Location;
import org.isvora.snap.service.MarvelSnapService;

import java.io.IOException;
import java.util.Optional;

public class MarvelSnap4jImpl implements MarvelSnap4j {

    private final MarvelSnapService marvelSnapService = new MarvelSnapService();

    public Optional<Card> getCard(String name) {
        try {
            return Optional.of(marvelSnapService.getCard(name));
        } catch (IOException | InterruptedException e) {
            return Optional.empty();
        }
    }

    public Optional<Location> getLocation(String name) {
        try {
            return Optional.of(marvelSnapService.getLocation(name));
        } catch (IOException | InterruptedException e) {
            return Optional.empty();
        }
    }
}
