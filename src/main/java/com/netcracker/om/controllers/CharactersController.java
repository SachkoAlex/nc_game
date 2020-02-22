package com.netcracker.om.controllers;

import com.netcracker.om.characters.Character;
import com.netcracker.om.characters.charactersImpl.Fireman;
import com.netcracker.om.characters.charactersImpl.Policeman;
import com.netcracker.om.characters.charactersImpl.Ryhor;

import java.util.HashMap;

public class CharactersController {
    private static final HashMap<Integer, Character> allCharacters = new HashMap<>(3);

    public static void setAllCharacters() {
        allCharacters.put(1, new Ryhor());
        allCharacters.put(2, new Policeman());
        allCharacters.put(3, new Fireman());
    }

    public static Character getCharacterByNumber(Integer number) throws IndexOutOfBoundsException {
        return allCharacters.get(number);
    }

    public static void showKeysAmount(Character character) {
       System.out.println("Amount of keys: " + character.getKeys());
    }
}
