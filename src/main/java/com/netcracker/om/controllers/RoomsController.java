package com.netcracker.om.controllers;

import com.netcracker.om.constants.Constants;
import com.netcracker.om.rooms.Room;
import com.sun.istack.internal.Nullable;

public class RoomsController {

    private RoomsController() {
    }
    @Nullable
    static String getRoomDescription(Room room) {
        if (Constants.RYHOR_SKILL.equals(room.getRoomQuest().getRequiredSkill())) {
            return Constants.ROOM_FOR_RYHOR;
        }
        if (Constants.FIREMAN_SKILL.equals(room.getRoomQuest().getRequiredSkill())) {
            return Constants.ROOM_FOR_FIREMAN;
        }
        if (Constants.POLICEMAN_SKILL.equals(room.getRoomQuest().getRequiredSkill())) {
            return Constants.ROOM_FOR_POLICEMAN;
        }
        return null;
    }
}

