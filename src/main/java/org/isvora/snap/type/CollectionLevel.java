package org.isvora.snap.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CollectionLevel {

    BASIC("Collection Level 1-14"),
    POOL_1("Collection Level 18-214 (Pool 1)"),
    POOL_2("Collection Level 222-450 (Pool 2)"),
    POOL_3("Collection Level 462-? (Pool 2)");

    private final String collectionLevel;

}
