package com.codedifferently.server.domain.pokemon.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stat {
    @JsonProperty("base_stat")
    private Integer baseStat;
    private Integer effort;
    @JsonProperty("stat")
    private StatData data;

    public Integer getBaseStat() {
        return baseStat;
    }

    public void setBaseStat(Integer baseStat) {
        this.baseStat = baseStat;
    }

    public Integer getEffort() {
        return effort;
    }

    public void setEffort(Integer effort) {
        this.effort = effort;
    }
}
