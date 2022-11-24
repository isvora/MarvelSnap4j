package org.isvora.snap.service;

import lombok.RequiredArgsConstructor;
import org.isvora.snap.model.Card;
import org.isvora.snap.model.Location;

import java.io.IOException;

@RequiredArgsConstructor
public class MarvelSnapService {

    private final CardService cardService = new CardService();
    private final LocationService locationService = new LocationService();
    private final static String api = "https://marvelsnap.io/api/search.php?database&";

    public Card getCard(String name) throws IOException, InterruptedException {
        return cardService.getCard(name, api);
    }

    public Location getLocation(String name) throws IOException, InterruptedException {
        return locationService.getLocation(name, api + "type=Location&");
    }
}
