package com.netcracker.om.quests.questImpl;

import com.netcracker.om.characters.Character;
import com.netcracker.om.characters.charactersImpl.Fireman;
import com.netcracker.om.quests.Quest;

public class FiremanQuest implements Quest {
    @Override
    public String completeQuest(Character character) {
        if (character.getClass() == Fireman.class) {
            return character.action();
        } else return "Wrong character, choose another";
    }
}
