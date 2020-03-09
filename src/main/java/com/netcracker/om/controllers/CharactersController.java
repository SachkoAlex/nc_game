package com.netcracker.om.controllers;

import com.netcracker.om.characters.Character;
import com.netcracker.om.characters.charactersImpl.Fireman;
import com.netcracker.om.characters.charactersImpl.Policeman;
import com.netcracker.om.characters.charactersImpl.Ryhor;
import com.netcracker.om.constants.Constants;

import java.util.HashMap;

public class CharactersController {

    private static final HashMap<Integer, Character> allCharacters = new HashMap<>(Constants.NUMBER_OF_CHARACTERS);

    static {
        allCharacters.put(1, new Ryhor());
        allCharacters.put(2, new Policeman());
        allCharacters.put(3, new Fireman());
    }

    private CharactersController() {
    }

    public static Character getCharacterByNumber(Integer number) throws IndexOutOfBoundsException {
        return allCharacters.get(number);
    }
}
