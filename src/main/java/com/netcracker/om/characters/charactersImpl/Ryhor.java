package com.netcracker.om.characters.charactersImpl;

import com.netcracker.om.characters.Character;

public class Ryhor implements Character {

    private static int keys;

    public Ryhor() {
        keys = 0;
    }

    @Override
    public void keysIncrease() {
        keys++;
    }

    @Override
    public int getKeys() {
        return keys;
    }

    @Override
    public String action() {
        return ("Кс-кс-кс");
    }
}
