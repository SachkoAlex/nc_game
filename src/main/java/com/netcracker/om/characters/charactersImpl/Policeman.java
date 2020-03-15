package com.netcracker.om.characters.charactersImpl;

import com.netcracker.om.characters.Character;
import com.netcracker.om.constants.Constants;

public class Policeman extends Character {

    private static String skill;

    public Policeman() {
        skill = Constants.POLICEMAN_SKILL;
    }

    public String getSkill() {
        return skill;
    }
}
