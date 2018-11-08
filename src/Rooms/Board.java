package Rooms;
import People.Person;

public class Board
{
    private Room[][] rooms;

    public Board(Room[][] a)
    {
        this.rooms = a;
    }
    public Board(int height, int width)
    {
        rooms=new Room[height][width];
        for(int i=0;i<rooms.length;i++)
        {
            for(int k=0;k<rooms[i].length;k++)
            {
                rooms[i][k]=new Room(i,k);
            }
        }
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void enterRoom(Person a, int x, int y)
    {
        rooms[x][y].enterRoom(a);
    }
    public void makeEyLmao()
    {
        int a=0;
        int b=0;
        for(int i=0;i<rooms[a].length;i++)
        {
            a =(int) (Math.random() * rooms.length);
            b =(int) (Math.random() * rooms.length);
            rooms[a][b] = new EyLmaoBoom(a, b);
        }
        int x = 0;
        int y = 0;
        while (x == 0 && y == 0) {
            x = (int) (Math.random() * rooms.length);
            y = (int) (Math.random() * rooms.length);
        }
        rooms[x][y] = new EzClap(x, y);


    }

    public String toString()
    {
        String str ="";
        for(Room[] a : rooms)
        {
            for(Room x:a)
            {
                str =str + x;
            }
            str = str + "\n";
        }
        return str;
    }
    public void print()
    {
        for(int i=0; i<rooms.length;i++)
        {
            for(int k=0;k<rooms[i].length;k++)
            {
                System.out.print(rooms[i][k]);
            }
            System.out.println();
        }
    }
}