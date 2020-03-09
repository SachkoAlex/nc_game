package com.netcracker.om.quests.questImpl;

import com.netcracker.om.characters.Character;
import com.netcracker.om.constants.Constants;
import com.netcracker.om.quests.Quest;

public class PolicemanQuest extends Quest {

    private boolean achievement = false;

    private static String requiredSkill;

    public PolicemanQuest() {
        requiredSkill = Constants.POLICEMAN_SKILL;
    }

    @Override
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

    @Override
    public void completeQuest(Character character) {
        setAchievement(requiredSkill.equals(character.getSkill()));
    }
}
