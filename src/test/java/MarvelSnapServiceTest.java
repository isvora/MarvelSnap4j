import lombok.SneakyThrows;
import org.isvora.snap.model.Card;
import org.isvora.snap.model.Location;
import org.isvora.snap.service.MarvelSnapService;
import org.isvora.snap.type.CollectionLevel;
import org.isvora.snap.type.Keyword;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class MarvelSnapServiceTest {

    private final MarvelSnapService marvelSnapService = new MarvelSnapService();

    @Test
    public void testGetCard() throws IOException, InterruptedException {
        String name = "Absorbing Man";

        Card response = marvelSnapService.getCard(name);

        Assertions.assertEquals(response.getName(), name);
        Assertions.assertEquals(response.getCost(), 4);
        Assertions.assertEquals(response.getPower(), 3);
    }

    @Test
    @SneakyThrows
    public void testGetLocation() {
        String name = "Asgard";

        Location response = marvelSnapService.getLocation(name);

        Assertions.assertEquals(response.getName(), name);
        Assertions.assertEquals(response.getType(), "Location");
    }

    @Test
    @SneakyThrows
    public void testGetCardsByKeyword() {
        Keyword keyword = Keyword.DESTROY;

        List<Card> cards = marvelSnapService.getCardsByKeyword(keyword);

        Assertions.assertFalse(cards.isEmpty());
    }

    @Test
    @SneakyThrows
    public void testGetCardsByCollectionLevel() {
        CollectionLevel collectionLevel = CollectionLevel.POOL_1;

        List<Card> cards = marvelSnapService.getCardsByCollectionLevel(collectionLevel);

        Assertions.assertFalse(cards.isEmpty());
        Assertions.assertEquals(cards.size(), 46);
    }
}
