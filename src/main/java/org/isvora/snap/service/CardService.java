package org.isvora.snap.service;

import org.isvora.snap.model.Card;
import org.isvora.snap.model.CardResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class CardService {

    private final HttpService<CardResponse> httpService = new HttpService();

    public Card getCard(String name, String api) throws IOException, InterruptedException {
        String params = URLEncoder.encode(name, StandardCharsets.UTF_8);

        CardResponse cardResponse = httpService.makeRequest(URI.create(api + "n=" + params), CardResponse.class);

        return cardResponse.getCards().get(0);
    }

}
