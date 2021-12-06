package com.codedifferently.server.domain.pokemon.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameIndex {
    @JsonProperty("game_index")
    private Integer index;
    private Version version;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "GameIndex{" +
                "index=" + index +
                ", version=" + version +
                '}';
    }
}
