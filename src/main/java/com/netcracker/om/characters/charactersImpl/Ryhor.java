package com.netcracker.om.characters.charactersImpl;

import com.netcracker.om.characters.Character;
import com.netcracker.om.constants.Constants;

public class Ryhor extends Character {

    private static String skill;

    public Ryhor() {
        skill = Constants.RYHOR_SKILL;
    }

    public String getSkill() {
        return skill;
    }
}
