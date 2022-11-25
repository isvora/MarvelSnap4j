package org.eridanus.snap;

import org.eridanus.snap.type.Ability;
import org.eridanus.snap.model.Card;
import org.eridanus.snap.model.Location;
import org.eridanus.snap.service.MarvelSnapService;
import org.eridanus.snap.type.CollectionLevel;
import org.eridanus.snap.type.Keyword;

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

    public Optional<List<Card>> getCardsByKeyword(Keyword keyword) {
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

    public Optional<List<Card>> getCardsByAbility(Ability ability) {
        try {
            return Optional.of(marvelSnapService.getCardsByAbility(ability));
        } catch (IOException | InterruptedException e) {
            return Optional.empty();
        }
    }

    public Optional<List<Card>> getCardsByCost(int cost) {
        try {
            return Optional.of(marvelSnapService.getCardsByCost(cost));
        } catch (IOException | InterruptedException e) {
            return Optional.empty();
        }
    }

    public Optional<List<Card>> getCardByPower(int power) {
        try {
            return Optional.of(marvelSnapService.getCardByPower(power));
        } catch (IOException | InterruptedException e) {
            return Optional.empty();
        }
    }
}