package io.github.snap;

import io.github.snap.type.Ability;
import io.github.snap.model.Card;
import io.github.snap.model.Location;
import io.github.snap.service.MarvelSnapService;
import io.github.snap.type.CollectionLevel;
import io.github.snap.type.Keyword;

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
