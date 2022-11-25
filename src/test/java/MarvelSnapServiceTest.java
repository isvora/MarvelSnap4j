import lombok.SneakyThrows;
import org.isvora.snap.model.Card;
import org.isvora.snap.model.Location;
import org.isvora.snap.service.MarvelSnapService;
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
        String keyword = "Destroy";

        List<Card> cards = marvelSnapService.getCardsByKeyword(keyword);

        Assertions.assertFalse(cards.isEmpty());
    }
}
