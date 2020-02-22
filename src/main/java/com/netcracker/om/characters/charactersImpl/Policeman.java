package com.netcracker.om.characters.charactersImpl;

import com.netcracker.om.characters.Character;

public class Policeman implements Character {
    public Policeman() {
    }

    @Override
    public String action() {
        return ("You're arrested!");
    }
}
