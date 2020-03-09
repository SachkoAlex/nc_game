package com.netcracker.om.controllers;

import com.netcracker.om.constants.Constants;
import com.netcracker.om.quests.Quest;
import com.netcracker.om.quests.questImpl.FiremanQuest;
import com.netcracker.om.quests.questImpl.PolicemanQuest;
import com.netcracker.om.quests.questImpl.RyhorQuest;

import java.util.ArrayList;

public class QuestsController {

    private static ArrayList<Quest> scenario = new ArrayList<>(Constants.NUMBER_OF_QUESTS);

    static {
        scenario.add(new RyhorQuest());
        scenario.add(new PolicemanQuest());
        scenario.add(new FiremanQuest());
    }

    private QuestsController() {
    }

    public static boolean checkQuestCompletion(Quest quest) {
        return quest.isAchievement();
    }

    public static Quest getRandomQuest() {
        return scenario.get((int) (Math.random() * Constants.NUMBER_OF_QUESTS));
    }
}
