package com.netcracker.om.rooms;

import com.netcracker.om.characters.Character;
import com.netcracker.om.quests.Quest;

public class Room {

    private Quest roomQuest;

    public Room(Quest roomQuest) {
        this.roomQuest = roomQuest;
    }

    public Quest getRoomQuest() {
        return roomQuest;
    }

    public void enterRoom(Character character) {
        roomQuest.completeQuest(character);
    }
}
