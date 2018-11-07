package Rooms;

import People.Person;

public class EyLmaoBoom extends Room {

    private int health;

    public EyLmaoBoom(int x, int y) {
        super(x, y);

    }
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("eyy Lmao -10 health");
        health=health-10;
    }
    public String toString()
    {
        return "[V]";
    }
}