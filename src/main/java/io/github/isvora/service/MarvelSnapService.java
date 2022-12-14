package io.github.isvora.service;

import io.github.isvora.model.Card;
import io.github.isvora.model.Location;
import io.github.isvora.type.Ability;
import io.github.isvora.utils.MarvelSnapUtils;
import lombok.RequiredArgsConstructor;
import io.github.isvora.type.CollectionLevel;
import io.github.isvora.type.Keyword;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
public class MarvelSnapService {

    private final CardService cardService = new CardService();
    private final LocationService locationService = new LocationService();


    public Card getCard(String name) throws IOException, InterruptedException {
        return cardService.getCard(name, MarvelSnapUtils.API);
    }

    public Location getLocation(String name) throws IOException, InterruptedException {
        return locationService.getLocation(name, MarvelSnapUtils.API);
    }

    public List<Card> getCardsByKeyword(Keyword keyword) throws IOException, InterruptedException {
        return cardService.getCardsByKeyword(keyword, MarvelSnapUtils.API + MarvelSnapUtils.CHARACTER);
    }

    public List<Card> getCardsByCollectionLevel(CollectionLevel collectionLevel) throws IOException, InterruptedException {
        return cardService.getCardsByCollectionLevel(collectionLevel, MarvelSnapUtils.API);
    }

    public List<Card> getCardsByAbility(Ability ability) throws IOException, InterruptedException {
        return cardService.getCardsByAbility(ability, MarvelSnapUtils.API);
    }

    public List<Card> getCardsByCost(int cost) throws IOException, InterruptedException {
        return cardService.getCardsByCost(cost, MarvelSnapUtils.API);
    }

    public List<Card> getCardByPower(int power) throws IOException, InterruptedException {
        return cardService.getCardByPower(power, MarvelSnapUtils.API);
    }
}
