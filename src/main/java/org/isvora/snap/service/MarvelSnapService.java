package org.isvora.snap.service;

import lombok.RequiredArgsConstructor;
import org.isvora.snap.model.Card;
import org.isvora.snap.model.Location;

import java.io.IOException;
import java.util.List;

import static org.isvora.snap.utils.MarvelSnapUtils.API;

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

    public List<Card> getCardsByKeyword(String keyword) throws IOException, InterruptedException {
        return cardService.getCardsByKeyword(keyword, API + "type=Character&");
    }
}
