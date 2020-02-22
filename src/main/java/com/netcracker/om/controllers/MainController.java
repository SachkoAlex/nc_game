package com.netcracker.om.controllers;

import com.netcracker.om.characters.Character;
import com.netcracker.om.quests.Quest;
import com.netcracker.om.rooms.Room;

import java.util.Scanner;

public class MainController {

    private static final String QUEST_FAILED = "Wrong character, choose another";

    private static final int NUMBER_OF_KEYS = 2;

    public static Character chooseCharacter() {
        System.out.println("Choose your character\n1. Ryhor\n2. Policeman\n3. Fireman");
        Scanner in = new Scanner(System.in);
        int charactersNumber = in.nextInt();
        return CharactersController.getCharacterByNumber(charactersNumber);
    }

    public static void enterRoom(Character character, Room room) {
        Scanner in = new Scanner(System.in);
        while (room.getKeys() < NUMBER_OF_KEYS) {
            System.out.println("Enter room with quest? \n1. Yes\n2. No");
            int choice = in.nextInt();
            if (choice == 1) {
                String questResult = room.checkQuestCompletion(character);
                if (QUEST_FAILED.equals(questResult)) {
                    System.out.println(QUEST_FAILED);
                    character = chooseCharacter();
                } else {
                    room.keysIncrease();
                    room.setRoomQuest(QuestsController.getRandomQuest());
                    System.out.println(questResult);
                }
            }
        }
    }


    public static void play() {
        QuestsController.init();
        CharactersController.setAllCharacters();
        Character character = chooseCharacter();
        Quest randomQuest = QuestsController.getRandomQuest();
        Room room = new Room(randomQuest);
        enterRoom(character, room);
    }
}
