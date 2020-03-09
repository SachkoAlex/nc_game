package com.netcracker.om.quests.questImpl;

import com.netcracker.om.characters.Character;
import com.netcracker.om.constants.Constants;
import com.netcracker.om.quests.Quest;

public class RyhorQuest extends Quest {

    private boolean achievement = false;

    private static String requiredSkill;

    public RyhorQuest() {
        requiredSkill = Constants.RYHOR_SKILL;
    }

    public String getRequiredSkill() {
        return requiredSkill;
    }

    @Override
    public boolean isAchievement() {
        return achievement;
    }

    @Override
    public void setAchievement(boolean completionResult) {
        achievement = completionResult;
    }

    public void completeQuest(Character character) {
        setAchievement(requiredSkill.equals(character.getSkill()));
    }
}
