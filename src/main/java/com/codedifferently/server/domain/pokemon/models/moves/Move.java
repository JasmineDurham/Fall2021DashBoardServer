package com.codedifferently.server.domain.pokemon.models.moves;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Move {

    @JsonProperty("move")
    private MoveData data;
    @JsonProperty("version_group_details")
    private ArrayList<VersionGroupDetails> versionGroupDetails;

    public ArrayList<VersionGroupDetails> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    public void setVersionGroupDetails(ArrayList<VersionGroupDetails> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }


    @Override
    public String toString() {
        return "Move{" +
                "data=" + data +
                ", versionGroupDetails=" + versionGroupDetails +
                '}';
    }
}