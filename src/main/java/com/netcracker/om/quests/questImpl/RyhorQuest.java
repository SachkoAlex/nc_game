package com.netcracker.om.quests.questImpl;

import com.netcracker.om.characters.Character;
import com.netcracker.om.characters.charactersImpl.Ryhor;
import com.netcracker.om.quests.Quest;

public class RyhorQuest implements Quest {
    @Override
    public String completeQuest(Character character) {
        if (character.getClass() == Ryhor.class) {
            return character.action();
        } else return "Wrong character, choose another";
    }
}
