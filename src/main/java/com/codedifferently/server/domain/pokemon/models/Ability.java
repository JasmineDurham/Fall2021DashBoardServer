package com.codedifferently.server.domain.pokemon.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ability {

    private AbilityData data;
    @JsonProperty("is_hidden")
    private Boolean isHidden;
    private String slot;

    public AbilityData getData() {
        return data;
    }

    public void setData(AbilityData data) {
        this.data = data;
    }

    public Boolean getHidden() {
        return isHidden;
    }

    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        return "Abilities{" +
                "data=" + data +
                ", isHidden=" + isHidden +
                ", slot='" + slot + '\'' +
                '}';
    }
}

