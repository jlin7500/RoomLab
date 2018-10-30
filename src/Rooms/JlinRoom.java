package Rooms;

import Game.Runner;
import People.Person;

public class JlinRoom extends Room
{
    public JlinRoom(int x, int y)
    {
        super(x, y);
    }
    @Override
    public void enterRoom(Person x)
    {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("????");
        Runner.gameOff();
    }
    public void leaveRoom(Person x)
    {
        occupant = null;
    }

}
