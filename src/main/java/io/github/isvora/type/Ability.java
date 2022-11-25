package io.github.isvora.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Ability {

    HAS_ABILITY("Has Ability"),
    NO_ABILITY("No Ability");

    private final String ability;
}
