package com.codedifferently.server.domain.pokemon.models.moves;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VersionGroupDetails {
    @JsonProperty("level_learned_at")
    private Integer levelLearnedAt;
    @JsonProperty("move_learn_method")
    private MoveLearnMethod moveLearnMethod;
    @JsonProperty("version_group")
    private VersionGroup versionGroup;

    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    public MoveLearnMethod getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
    }

    @Override
    public String toString() {
        return "VersionGroupDetails{" +
                "levelLearnedAt=" + levelLearnedAt +
                ", moveLearnMethod=" + moveLearnMethod +
                ", versionGroup=" + versionGroup +
                '}';
    }
}
