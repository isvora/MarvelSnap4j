package org.isvora.snap.type;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CollectionLevel {

    STARTER_CARD("Starter Card"),
    SEASON_01("Season 01"),
    RECRUIT_SEASON("Recruit Season"),
    BASIC("Collection Level 1-14"),
    POOL_1("Collection Level 18-214 (Pool 1)"),
    POOL_2("Collection Level 222-450 (Pool 2)"),
    POOL_3("Collection Level 462-? (Pool 3)");

    private final String collectionLevel;

    @JsonValue
    public String getCollectionLevel() {
        return collectionLevel;
    }
}
