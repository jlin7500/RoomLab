package Rooms;
import Game.Runner;
import People.Person;

public class EzClap extends Room{
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
    }
    public String toString()
    {
        return "[ ]";
    }

}