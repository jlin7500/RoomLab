package Rooms;
import Game.Runner;
import People.Person;

public class EyLmaoBoom extends Room
{

    private int health;

    public EyLmaoBoom(int x, int y)
    {
        super(x, y);

    }
    @Override
    public void enterRoom(Person x)
    {
        health = 20;
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("eyy Lmao boom -10 health");
        health=health-10;
        if (health==0)
        {
            Runner.gameOff();
            System.out.println("You have lost all your hp");
        }
    }
    public String toString()
    {
        return "[X]";
    }
}