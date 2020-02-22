package com.netcracker.om.controllers;

import com.netcracker.om.quests.Quest;
import com.netcracker.om.quests.questImpl.FiremanQuest;
import com.netcracker.om.quests.questImpl.PolicemanQuest;
import com.netcracker.om.quests.questImpl.RyhorQuest;

import java.util.ArrayList;

public class QuestsController {
    private static ArrayList<Quest> scenario = new ArrayList<>(6);

    public static void init() {
        scenario.add(new RyhorQuest());
        scenario.add(new RyhorQuest());
        scenario.add(new PolicemanQuest());
        scenario.add(new PolicemanQuest());
        scenario.add(new FiremanQuest());
        scenario.add(new FiremanQuest());
    }

    public static Quest getRandomQuest() {
        int questNumber = (int) (Math.random() * 6);
        return scenario.get(questNumber);
    }
}
