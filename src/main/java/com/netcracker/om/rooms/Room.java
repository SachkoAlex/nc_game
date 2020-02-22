package com.netcracker.om.rooms;

import com.netcracker.om.characters.Character;
import com.netcracker.om.quests.Quest;

public class Room {

    private Quest roomQuest;

    private int keys;

    public Room(Quest roomQuest) {
        this.roomQuest = roomQuest;
        keys = 0;
    }

    public int getKeys() {
        return keys;
    }

    public int keysIncrease() {
        return keys++;
    }

    public void setRoomQuest(Quest roomQuest) {
        this.roomQuest = roomQuest;
    }

    public String checkQuestCompletion(Character character) {
        return roomQuest.completeQuest(character);
    }
}
