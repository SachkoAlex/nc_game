package com.netcracker.om.quests.questImpl;

import com.netcracker.om.characters.Character;
import com.netcracker.om.characters.charactersImpl.Policeman;
import com.netcracker.om.quests.Quest;

public class PolicemanQuest implements Quest {
    @Override
    public String completeQuest(Character character) {
        if (character.getClass() == Policeman.class) {
            return character.action();
        } else return "Wrong character, choose another";
    }
}
