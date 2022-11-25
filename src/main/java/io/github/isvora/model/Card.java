package io.github.isvora.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.extern.jackson.Jacksonized;
import io.github.isvora.type.CollectionLevel;

@Jacksonized
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {

    private int id;

    private String name;

    private String type;

    private int cost;

    private int power;

    private String ability;

    @JsonProperty("method")
    private CollectionLevel collectionLevel;

}
