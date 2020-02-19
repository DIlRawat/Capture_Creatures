/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creaturecapture;

/**
 *
 * @author Dil Bdr
 */
public class Player {

    private static final  int ENERGY = 100;
           private int energylevel = ENERGY;
    /**
     * constructor that sets the energy level to 100.
     */
    public Player() {

        

    }
// creature object
    Creature creature;

    /**
     *
     * @return the energy level of the player.
     */
    public int getenergy() {
        return energylevel;
    }

    /**
     *
     * @param w is the value of weapon player using.
     */
    public void Web(int w) {

        energylevel -= w;
    }

    public String toString() {
        return String.format("Current Energy Level is: ", energylevel);

    }

    /**
     *
     * @param b is the value of weapon player using.
     */
    public void Bubble(int b) {

        energylevel -= b;
    }

    /**
     *
     * @param f is the value of weapon player using.
     */
    public void Freeze(int f) {
        energylevel -= f;

    }

    /**
     *
     * @return true if the energy level of player becomes zero.
     */
    public boolean gameover() {
        return (energylevel == 0);
    }

    /**
     *
     * @param energy is the value of energy added to the player's current energy
     * when a creature is captured.
     */
    public void EnergyAdded(int energy) {
        energylevel += energy;

    }
}
