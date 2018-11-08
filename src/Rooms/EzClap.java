package Rooms;
import Game.Runner;
import People.Person;

public class EzClap extends Room{
    private int health;

    public EzClap(int x, int y)
    {
        super(x, y);
    }


    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Ey Lmao you ded boi.");
        Runner.gameOff();
        health = 0;
    }
    public String toString()
    {
        return "[ ]";
    }

}