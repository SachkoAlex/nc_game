package com.netcracker.om.controllers;

import com.netcracker.om.characters.Character;
import com.netcracker.om.characters.charactersImpl.Ryhor;
import com.netcracker.om.constants.Constants;
import com.netcracker.om.quests.Quest;
import com.netcracker.om.quests.questImpl.RyhorQuest;
import com.netcracker.om.rooms.Room;

import java.util.Scanner;

public class MainController {

    private static Quest RANDOM_QUEST = QuestsController.getRandomQuest();

    private MainController() {
    }

    public static void printLine(String line) {
        System.out.println(line);
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static Character chooseCharacter() {
        printLine(Constants.CHOOSING_CHARACTER_REQUEST);
        Scanner in = getScanner();
        int charactersNumber = in.nextInt();
        return CharactersController.getCharacterByNumber(charactersNumber);
    }

    public static Room moveAnotherRoom(Character character) {
        if (QuestsController.checkQuestCompletion(RANDOM_QUEST)) {
            character.keysAmountIncrease();
            RANDOM_QUEST = QuestsController.getRandomQuest();
            return new Room(RANDOM_QUEST);
        }
        return new Room(RANDOM_QUEST);
    }

    public static void play() {
        Room room = new Room(RANDOM_QUEST);
        Character character = chooseCharacter();
        int choice;
        while (character.getKeys() < Constants.NUMBER_OF_KEYS) {
            printLine(Constants.GET_KEYS_AMOUNT_REQUEST + character.getKeys());
            printLine(Constants.ENTER_ROOM_REQUEST);
            choice = getScanner().nextInt();
            if (choice == Constants.AGREEMENT) {
                room.enterRoom(character);
            }
            room = moveAnotherRoom(character);
        }
    }
}
