# MarvelSnap4j

MarvelSnap4j is a java wrapper over the api that https://marvelsnap.io uses for their card collection.

Marvel Snap is a trading card game in the Marvel universe developed by Nuverse and Second dinner https://www.marvelsnap.com/

# Quickstart

In order to use the library we can import it from maven central. Just add the dependency to your pom.xml

```
<dependency>
  <groupId>io.github.isvora</groupId>
  <artifactId>marvel-snap-4j</artifactId>
  <version>1.0.1</version>
</dependency>
```

Then we need to get a MarvelSnap4j Instance

```java
import io.github.isvora.MarvelSnap4j;
public class Main {
    public static void main(String... args){
        MarvelSnap4jImpl marvelSnap4j = MarvelSnap4j.getInstance();
    }
}
```

Then we can use the `marvelSnap4j` object to get information about the cards/location of the game.

## Get card

```
Optional<Card> card = marvelSnap4j.getCard(String name)
```

Example: 
```
Optional<Card> card = marvelSnap4j.getCard("Captain America")
```

## Get location

```
Optional<Location> location = marvelSnap4j.getLocation(String name)
```

Example: 
```
Optional<Location> location - marvelSnap4j.getLocation("Ego")
```

## Get cards by keyword

```
Optional<List<Card>> cards = marvelSnap4j.getCardsByKeyword(Keyword keyword)
```

Example: 
```
Optional<List<Card>> cards = marvelSnap4j.getCardsByKeyword(Keyword.ONGOING)
```

## Get cards by collection level

```
Optional<List<Card>> cards = marvelSnap4j.getCardsByCollectionLevel(CollectionLevel level)
```

Example: 
```
Optional<List<Card>> cards = marvelSnap4j.getCardsByCollectionLevel(CollectionLevel.POOL_1)
```

## Get cards by cost

```
Optional<List<Card>> cards = marvelSnap4j.getCardsByCost(int cost)
```

Example: 
```
Optional<List<Card>> cards = marvelSnap4j.getCardsByCost(3)
```

## Get cards by power

```
Optional<List<Card>> cards = marvelSnap4j.getCardsByPower(int power)
```

Example: 
```
Optional<List<Card>> cards = marvelSnap4j.getCardsByPower(4)
```
