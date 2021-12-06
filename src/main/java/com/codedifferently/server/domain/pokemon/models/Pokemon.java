package com.codedifferently.server.domain.pokemon.models;

import com.codedifferently.server.domain.pokemon.models.moves.Move;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Pokemon {
    @JsonProperty("base_experience")
    private Integer baseExperience;
    @JsonProperty("game_indices")
    private ArrayList<GameIndex> gameIndices;
    @JsonProperty("abilities")
    private ArrayList<Ability> abilities;
    private ArrayList<Move> moves;
    private ArrayList<Form> forms;
    private Integer height;
    @JsonProperty("held_items")
    private ArrayList<HeldItem> heldItems;
    private Integer id;
    @JsonProperty("is_default")
    private Boolean isDefault;
    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;
    private String name;
    private Integer order;
    @JsonProperty("past_types")
    private ArrayList<PastTypes> pastTypes ;
    private Species species;
    private ArrayList<Stat> stats;
    private ArrayList<Type> types;
    private Integer weight;


    public Integer getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    public ArrayList<GameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(ArrayList<GameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public ArrayList<Form> getForms() {
        return forms;
    }

    public void setForms(ArrayList<Form> forms) {
        this.forms = forms;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public ArrayList<HeldItem> getHeldItems() {
        return heldItems;
    }

    public void setHeldItems(ArrayList<HeldItem> heldItems) {
        this.heldItems = heldItems;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public ArrayList<PastTypes> getPastTypes() {
        return pastTypes;
    }

    public void setPastTypes(ArrayList<PastTypes> pastTypes) {
        this.pastTypes = pastTypes;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public ArrayList<Stat> getStats() {
        return stats;
    }

    public void setStats(ArrayList<Stat> stats) {
        this.stats = stats;
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Type> types) {
        this.types = types;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "baseExperience=" + baseExperience +
                ", gameIndices=" + gameIndices +
                ", abilities=" + abilities +
                ", moves=" + moves +
                ", forms=" + forms +
                ", height=" + height +
                ", heldItems=" + heldItems +
                ", id=" + id +
                ", isDefault=" + isDefault +
                ", locationAreaEncounters='" + locationAreaEncounters + '\'' +
                ", name='" + name + '\'' +
                ", order=" + order +
                ", pastTypes=" + pastTypes +
                ", species=" + species +
                ", stats=" + stats +
                ", types=" + types +
                ", weight=" + weight +
                '}';
    }
}