package com.codedifferently.server.domain.pokemon.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Type {
    private Integer slot;
    @JsonProperty("type")
    private TypeData data;

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public TypeData getData() {
        return data;
    }

    public void setData(TypeData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Type{" +
                "slot=" + slot +
                ", data=" + data +
                '}';
    }
}
