package org.isvora.snap.service;

import lombok.RequiredArgsConstructor;
import org.isvora.snap.model.Card;
import org.isvora.snap.model.Location;
import org.isvora.snap.type.Ability;
import org.isvora.snap.type.CollectionLevel;
import org.isvora.snap.type.Keyword;

import java.io.IOException;
import java.util.List;

import static org.isvora.snap.utils.MarvelSnapUtils.API;
import static org.isvora.snap.utils.MarvelSnapUtils.CHARACTER;

@RequiredArgsConstructor
public class MarvelSnapService {

    private final CardService cardService = new CardService();
    private final LocationService locationService = new LocationService();


    public Card getCard(String name) throws IOException, InterruptedException {
        return cardService.getCard(name, API);
    }

    public Location getLocation(String name) throws IOException, InterruptedException {
        return locationService.getLocation(name, API);
    }

    public List<Card> getCardsByKeyword(Keyword keyword) throws IOException, InterruptedException {
        return cardService.getCardsByKeyword(keyword, API + CHARACTER);
    }

    public List<Card> getCardsByCollectionLevel(CollectionLevel collectionLevel) throws IOException, InterruptedException {
        return cardService.getCardsByCollectionLevel(collectionLevel, API);
    }

    public List<Card> getCardsByAbility(Ability ability) throws IOException, InterruptedException {
        return cardService.getCardsByAbility(ability, API);
    }

    public List<Card> getCardsByCost(int cost) throws IOException, InterruptedException {
        return cardService.getCardsByCost(cost, API);
    }

    public List<Card> getCardByPower(int power) throws IOException, InterruptedException {
        return cardService.getCardByPower(power, API);
    }
}
