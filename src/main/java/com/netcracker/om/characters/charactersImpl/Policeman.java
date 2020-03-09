package com.netcracker.om.characters.charactersImpl;

import com.netcracker.om.characters.Character;
import com.netcracker.om.constants.Constants;

public class Policeman extends Character {
    private static int keys;

    private static String skill;

    public Policeman() {
        skill = Constants.POLICEMAN_SKILL;
        keys = 0;
    }

    public String getSkill() {
        return skill;
    }

    public int getKeys() {
        return keys;
    }

    public void keysAmountIncrease() {
        keys++;
    }
}
