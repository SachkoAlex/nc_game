package com.netcracker.om.characters.charactersImpl;

import com.netcracker.om.characters.Character;
import com.netcracker.om.constants.Constants;

public class Ryhor extends Character {

    private static int keys;

    private static String skill;

    public Ryhor() {
        skill = Constants.RYHOR_SKILL;
        keys = 0;
    }

    public int getKeys() {
        return keys;
    }

    public String getSkill() {
        return skill;
    }

    public void keysAmountIncrease() {
        keys++;
    }
}
