/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creaturecapture;

import java.util.*;

/**
 *
 * @author Dil Bdr
 */
public class Creature {

    private int speed;  // variable to store speed of creature
    private int strength; //variable to store strength of creature

    final int TOTAL;

    private boolean captured = false; // boolean initially stored as false.
    /**
     * created a player object p1.
     */
    Player p1 = new Player();

    /**
     *
     * @param speed of the creature.
     * @param strength of the creature.
     */
    public Creature(int speed, int strength) {
        this.speed = speed;
        this.strength = strength;
        this.TOTAL = speed + strength;
    }

    /**
     *
     * @return total of speed and strength which is total energy player will get
     * when creature is captured.
     */
    public int totalenergy() {
        return TOTAL;
    }

    /**
     *
     * @return the speed of creature.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     *
     * @return the strength of creature.
     */
    public int getStrength() {
        return strength;
    }

    /**
     *
     * @return true if the creature is captured when player chooses web cast.
     */
    public boolean WebCast() {

        return captured = true;
    }

    /**
     *
     * @return true if the creature is captured when player throws force bubble.
     */
    public boolean ForceBubble() {
        if (strength < 10) {
            captured = true;
            return true;
        }
        return false;

    }

    /**
     *
     * @param x is the amount of energy that user want to use in freeze ray.
     * @return ture if the creature is captured with the freeze ray.
     */
    public boolean FreezeRay(int x) {

        speed -= x / 2;
        strength -= x / 2;

        if (speed <= 0 || strength <= 0) {
            captured = true;
        }
        return false;
    }

    /**
     *
     * @return true when creature is captured
     */
    public boolean CreatureCaptured() {
        return captured;
    }

}
