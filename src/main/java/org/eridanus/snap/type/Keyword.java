package org.eridanus.snap.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Keyword {

    DESTROY("Destroy"),
    MOVE("Move"),
    ONGOING("Ongoing"),
    ON_REVEAL("On Reveal");

    private final String keyword;
}
