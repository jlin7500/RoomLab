package Game;

import People.Person;
import Rooms.Board;
import Rooms.Room;

import java.util.Scanner;

public class Runner {

	private static boolean gameOn = true;

	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		int length = 0;
		int width = 0;

		System.out.println("Hello welcome to my thing????");
		System.out.println("Please Choose a Map Size" + "\n" + "s for Small Map" + "\n" + "m for Medium Map" + "\n" + "l for Large Map");
		System.out.println("You will be represented as 'S' on the board.");

		String mapsize = "";

		while(!mapsize.equalsIgnoreCase("s")&&(!mapsize.equalsIgnoreCase("m"))&&(!mapsize.equalsIgnoreCase("l"))&&(!mapsize.equalsIgnoreCase("secret"))) {
			mapsize=in.nextLine();
			if (mapsize.equalsIgnoreCase("S"))
			{
				length = 5;
				width = 5;
			}
			else if (mapsize.equalsIgnoreCase("M"))
			{
				length = 10;
				width = 10;
			}
			else if (mapsize.equalsIgnoreCase("L"))
			{
				length = 15;
				width = 15;

			}
			else
				{
					System.out.println("Please Type S , M , or L");
				mapsize = in.nextLine();
			}
		}

		Board building = new Board(length, width);
		building.makeEyLmao();
		building.print();

		Person player = new Person("FirstName", "FamilyName", 0,0);
		building.enterRoom(player,0,0);

		int health = 20;

			/*for (int k = player1.getxLoc(); k < printMap.length; k++)
			{
				for (int z = player1.getyLoc(); z < printMap.length; z++)
				{
					if (k == player1.getxLoc() && z == player1.getyLoc())
					{
						System.out.println(player1.getxLoc());
						System.out.println(player1.getyLoc());
					}
				}
			}
			*/
			while(gameOn&&health!=0)
			{
				System.out.println("Choose N , S , E , W to move.");
				System.out.println("You will start in the top left corner.");
				System.out.println("Move to see your position on the map.");
				String move = in.nextLine();
				if(validMove(move, player, building.getRooms()))
				{
					building.print();
					System.out.println("Your coordinates: row = " + player.getxLoc() + " col = " + player.getyLoc());
				}
				else
					{
					System.out.println("Please choose a valid move.");
				}
			}
			in.close();
	}


	/**
	 * Checks that the movement chosen is within the valid game map.
	 * @param move the move chosen
	 * @param p person moving
	 * @param map the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move)
		{
			case "n":
				if (p.getxLoc() > 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	


}
