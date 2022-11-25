package com.eridanus.snap.service;

import com.eridanus.snap.model.Card;
import com.eridanus.snap.type.Ability;
import com.eridanus.snap.type.CollectionLevel;
import com.eridanus.snap.utils.MarvelSnapUtils;
import com.eridanus.snap.model.CardResponse;
import com.eridanus.snap.type.Keyword;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class CardService {

    private final HttpService<CardResponse> httpService = new HttpService();

    public Card getCard(String name, String api) throws IOException, InterruptedException {
        String params = URLEncoder.encode(name, StandardCharsets.UTF_8);

        CardResponse cardResponse = httpService.makeRequest(URI.create(api + "n=" + params), CardResponse.class);

        return cardResponse.getCards().get(0);
    }

    public List<Card> getCardsByKeyword(Keyword keyword, String api) throws IOException, InterruptedException {
        String params = URLEncoder.encode(keyword.getKeyword(), StandardCharsets.UTF_8);
        String stringBuilder = api +
                MarvelSnapUtils.CHARACTER +
                "keyword=" +
                params +
                MarvelSnapUtils.LIMIT_1000;

        CardResponse cardResponse = httpService.makeRequest(URI.create(stringBuilder), CardResponse.class);

        return cardResponse.getCards();
    }

    public List<Card> getCardsByCollectionLevel(CollectionLevel collectionLevel, String api) throws IOException, InterruptedException {
        String params = URLEncoder.encode(collectionLevel.getCollectionLevel(), StandardCharsets.UTF_8);
        String stringBuilder = api +
                "obtain=" +
                params +
                MarvelSnapUtils.LIMIT_1000;

        CardResponse cardResponse = httpService.makeRequest(URI.create(stringBuilder), CardResponse.class);

        return cardResponse.getCards();
    }

    public List<Card> getCardsByAbility(Ability ability, String api) throws IOException, InterruptedException {
        String params = URLEncoder.encode(ability.getAbility(), StandardCharsets.UTF_8);
        String stringBuilder = api +
                "ability_status=" +
                params +
                MarvelSnapUtils.LIMIT_1000;

        CardResponse cardResponse = httpService.makeRequest(URI.create(stringBuilder), CardResponse.class);

        return cardResponse.getCards();
    }

    public List<Card> getCardsByCost(int cost, String api) throws IOException, InterruptedException {
        String stringBuilder = api +
                "cost=" +
                cost +
                MarvelSnapUtils.LIMIT_1000;

        CardResponse cardResponse = httpService.makeRequest(URI.create(stringBuilder), CardResponse.class);

        return cardResponse.getCards();
    }

    public List<Card> getCardByPower(int power, String api) throws IOException, InterruptedException {
        String stringBuilder = api +
                "power=" +
                power +
                MarvelSnapUtils.LIMIT_1000;

        CardResponse cardResponse = httpService.makeRequest(URI.create(stringBuilder), CardResponse.class);

        return cardResponse.getCards();
    }

}
