package com.netcracker.om.characters.charactersImpl;

import com.netcracker.om.characters.Character;
import com.netcracker.om.constants.Constants;

public class Fireman extends Character {

    private static String skill;

    public Fireman() {
        skill = Constants.FIREMAN_SKILL;
    }

    public String getSkill() {
        return skill;
    }
}
