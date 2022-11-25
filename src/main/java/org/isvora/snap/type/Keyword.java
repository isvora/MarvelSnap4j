package org.isvora.snap.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Keyword {

    DESTROY("Destroy"),
    MOVE("Move"),
    ONGOING("Ongoing"),
    ON_REVEAL("On Reveal"),
    SUMMON("Summon");

    private final String keyword;
}