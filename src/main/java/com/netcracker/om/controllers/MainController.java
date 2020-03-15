package com.netcracker.om.controllers;

import com.netcracker.om.characters.Character;
import com.netcracker.om.constants.Constants;
import com.netcracker.om.quests.Quest;
import com.netcracker.om.rooms.Room;

import java.util.Scanner;

public class MainController {

    private static Quest RANDOM_QUEST = QuestsController.getRandomQuest();

    private static Character CHARACTER = chooseCharacter();

    private static int numberOfCompletedQuests = Constants.ZERO_VALUE;

    private MainController() {
    }

    public static void increaseNumberOfCompletedQuests() {
        numberOfCompletedQuests++;
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

    public static Room moveAnotherRoom() {
        if (QuestsController.checkQuestCompletion(RANDOM_QUEST)) {
            printLine(Constants.QUEST_COMPLETION);
            increaseNumberOfCompletedQuests();
            RANDOM_QUEST = QuestsController.getRandomQuest();
            return new Room(RANDOM_QUEST);
        }
        printLine(Constants.WRONG_CHARACTER_RESPONSE);
        CHARACTER = chooseCharacter();
        return new Room(RANDOM_QUEST);
    }

    public static void play() {
        Room room = new Room(RANDOM_QUEST);
        int choice;
        while (numberOfCompletedQuests < Constants.NUMBER_OF_QUESTS_FOR_VICTORY) {
            printLine(Constants.GET_COMPLETED_QUESTS_AMOUNT_REQUEST + numberOfCompletedQuests);
            printLine(Constants.QUEST_NAME_PREFIX + RoomsController.getRoomDescription(room));
            printLine(Constants.ENTER_ROOM_REQUEST);
            choice = getScanner().nextInt();
            if (choice == Constants.AGREEMENT) {
                room.enterRoom(CHARACTER);
            }
            if (choice == Constants.NUMBER_OF_CHARACTER_CHOICES) {
                CHARACTER = chooseCharacter();
                room.enterRoom(CHARACTER);
            }
            room = moveAnotherRoom();
        }
    }
}
