package org.isvora.snap;

import org.isvora.snap.model.Card;
import org.isvora.snap.model.Location;
import org.isvora.snap.service.MarvelSnapService;
import org.isvora.snap.type.CollectionLevel;

import java.io.IOException;
import java.util.List;
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

    public Optional<List<Card>> getCardsByKeyword(String keyword) {
        try {
            return Optional.of(marvelSnapService.getCardsByKeyword(keyword));
        } catch (IOException | InterruptedException e) {
            return Optional.empty();
        }
    }

    public Optional<List<Card>> getCardsByCollectionLevel(CollectionLevel collectionLevel) {
        try {
            return Optional.of(marvelSnapService.getCardsByCollectionLevel(collectionLevel));
        } catch (IOException | InterruptedException e) {
            return Optional.empty();
        }
    }
}
