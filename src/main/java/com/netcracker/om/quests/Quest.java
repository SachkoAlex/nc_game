package com.netcracker.om.quests;

import com.netcracker.om.characters.Character;
import com.netcracker.om.controllers.MainController;

public abstract class Quest {

    private boolean achievement = false;

    private String requiredSkill;

    public abstract String getRequiredSkill();

    public abstract boolean isAchievement();

    public abstract void setAchievement(boolean completionResult);

    public abstract void completeQuest(Character character);
}
