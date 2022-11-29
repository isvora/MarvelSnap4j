# MarvelSnap4j

MarvelSnap4j is a java wrapper over the api that https://marvelsnap.io uses for their card collection.

Marvel Snap is a trading card game in the Marvel universe developed by Nuverse and Second dinner https://www.marvelsnap.com/

# Quickstart

In order to use the library we can import it from maven central. Just add the dependency to your pom.xml

```xml
<dependency>
  <groupId>io.github.isvora</groupId>
  <artifactId>marvel-snap-4j</artifactId>
  <version>1.0.1</version>
</dependency>
```

Then we need to get a `MarvelSnap4j` Instance

```java
import io.github.isvora.MarvelSnap4jImpl;

public class Main {

    public static void main(String... args) {
        MarvelSnap4jImpl marvelSnap4j = MarvelSnap4j.getInstance();
    }

}
```

Then we can use the `marvelSnap4j` object to get information about the cards/location of the game.

```java
import io.github.isvora.MarvelSnap4j;
import io.github.isvora.MarvelSnap4jImpl;
import io.github.isvora.model.Card;
import io.github.isvora.model.Location;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String... args) {
        MarvelSnap4jImpl marvelSnap4j = MarvelSnap4j.getInstance();

        // Returns a Card instance if found by the given name
        Optional<Card> card = marvelSnap4j.getCard("Captain America");

        // Returns a Location instance if found by the given name
        Optional<Location> location = marvelSnap4j.getLocation("Ego");

        // Returns a list of cards for a given keyword.
        Optional<List<Card>> cards = marvelSnap4j.getCardsByKeyword(Keyword.ONGOING);

        // Returns a list of cards for a given collection level.
        Optional<List<Card>> cards = marvelSnap4j.getCardsByCollectionLevel(CollectionLevel.POOL_1);

        // Returns a list of cards that have a given power
        Optional<List<Card>> cards = marvelSnap4j.getCardsByPower(3);

        // Returns a list of cards that have a given cost
        Optional<List<Card>> cards = marvelSnap4j.getCardsByCost(2);
    }
}
```
