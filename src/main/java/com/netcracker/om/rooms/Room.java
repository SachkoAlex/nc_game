package com.netcracker.om.rooms;

import com.netcracker.om.characters.Character;
import com.netcracker.om.quests.Quest;

public class Room {

    private Quest roomQuest;

    public Room(Quest roomQuest) {
        this.roomQuest = roomQuest;
    }

    public void setRoomQuest(Quest roomQuest) {
        this.roomQuest = roomQuest;
    }

    public String checkQuestCompletion(Character character) {
        return roomQuest.completeQuest(character);
    }
}
