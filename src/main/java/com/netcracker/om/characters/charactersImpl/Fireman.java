package com.netcracker.om.characters.charactersImpl;

import com.netcracker.om.characters.Character;

public class Fireman implements Character {
    public Fireman() {
    }

    @Override
    public String action() {
        return ("Fire extinguished, congratulations!");
    }
}
