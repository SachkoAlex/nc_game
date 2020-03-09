package com.netcracker.om.characters;

public abstract class Character {

    private static int keys;

    private static String skill;

    public abstract void keysAmountIncrease();

    public abstract int getKeys();

    public abstract String getSkill();
}
