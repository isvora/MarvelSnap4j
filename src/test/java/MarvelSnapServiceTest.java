import lombok.SneakyThrows;
import com.eridanus.snap.model.Card;
import com.eridanus.snap.model.Location;
import com.eridanus.snap.service.MarvelSnapService;
import com.eridanus.snap.type.Ability;
import com.eridanus.snap.type.CollectionLevel;
import com.eridanus.snap.type.Keyword;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @SneakyThrows
    @ParameterizedTest
    @EnumSource(Keyword.class)
    public void testGetCardsByKeyword(Keyword keyword) {
        List<Card> cards = marvelSnapService.getCardsByKeyword(keyword);

        Assertions.assertFalse(cards.isEmpty());
    }

    @SneakyThrows
    @ParameterizedTest
    @EnumSource(CollectionLevel.class)
    public void testGetCardsByCollectionLevel(CollectionLevel collectionLevel) {
        List<Card> cards = marvelSnapService.getCardsByCollectionLevel(collectionLevel);

        Assertions.assertFalse(cards.isEmpty());
    }

    @SneakyThrows
    @ParameterizedTest
    @EnumSource(Ability.class)
    public void testGetCardsByAbility(Ability ability) {
        List<Card> cards = marvelSnapService.getCardsByAbility(ability);

        Assertions.assertFalse(cards.isEmpty());
    }

    @SneakyThrows
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void testGetCardsByAbility(int cost) {
        List<Card> cards = marvelSnapService.getCardsByCost(cost);

        Assertions.assertFalse(cards.isEmpty());
    }

    @SneakyThrows
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void testGetCardsByPower(int power) {
        List<Card> cards = marvelSnapService.getCardByPower(power);

        Assertions.assertFalse(cards.isEmpty());
    }
}
