# MarvelSnap4j

MarvelSnap4j is a java wrapper over the api that https://marvelsnap.io uses for their card collection.

Marvel Snap is a trading card game in the Marvel universe developed by Nuverse and Second dinner https://www.marvelsnap.com/

# Quickstart

First we need to get a MarvelSnap4j Instance

```
MarvelSnap4jImpl marvelSnap4j = MarvelSnap4j.getInstance();
```

Then,  we can use the `marvelSnap4j` object to get information about the cards/location of the game.

### Get card

`Optional<Card> card = marvelSnap4j.getCard(String name)`

Example: `Optional<Card> card = marvelSnap4j.getCard("Captain America")`

### Get location

```Optional<Location> location = marvelSnap4j.getLocation(String name)```

Example: ```Optional<Location> location - marvelSnap4j.getLocation("Ego")```

### Get cards by keyword

```Optional<List<Card>> cards = marvelSnap4j.getCardsByKeyword(Keyword keyword)```

Example: ```Optional<List<Card>> cards = marvelSnap4j.getCardsByKeyword(Keyword.ONGOING)```

### Get cards by collection level

```Optional<List<Card>> cards = marvelSnap4j.getCardsByCollectionLevel(CollectionLevel collectionLevel)```

Example: ```Optional<List<Card>> cards = marvelSnap4j.getCardsByCollectionLevel(CollectionLevel.POOL_1)```

### Get cards by cost

```Optional<List<Card>> cards = marvelSnap4j.getCardsByCost(int cost)```

Example: ```Optional<List<Card>> cards = marvelSnap4j.getCardsByCost(3)```

### Get cards by power

```Optional<List<Card>> cards = marvelSnap4j.getCardsByPower(int power)```

Example: ```Optional<List<Card>> cards = marvelSnap4j.getCardsByPower(4)```