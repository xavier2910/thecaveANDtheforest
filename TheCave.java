import java.util.Scanner;
import java.io.IOException;

class TheCave {
    public static void main(String[] args)
    {
	System.out.println("The Cave Java Edition 1.1.0\n By Xavier\n\ntype the number of the option you want to choose and press enter\n\n");
	try
	{
	    Start();
	} catch(Exception e)
	{
	    System.out.println("Error: " + e);
	}
    }

    private static void Start() throws IOException
    {
	System.out.println("You are looking into the mouth of a dark cave. Surrounding you \n" +
			  "are trees so thick you can hardly see your hands in front of your \n" +
			  "face. However, there is a teleporter nearby.\n" +
			  "\t--1: Enter cave\n" +
			  "\t--2: Teleport");

	
	int _1 = getResponse(2);

	if (_1 == 1)
	{
	    EnterCave();
	}
	else
	{
	    Teleport();
	}
    }

    private static int getResponse(int max)
    {
	System.out.print("\ntype number> ");
	boolean gotNum = false;
	int num = 0;
	String input = "";
	Scanner scan = new Scanner(System.in);
	while (!gotNum) {
	    try {
		num = scan.nextInt();
		if (num > 0 && num <= max) {
		    gotNum = true;
		} else {
		    System.out.printf("\nInvalid input (there is no option %d). Please select a valid option.\n\ntype number> ", num);
		}

	    } catch (Exception e) {
		System.out.printf("\nInvalid input (not a number). Please try again.\n\ntype number> ", input);
		scan.nextLine();
	    }

	}
	return num;
    }

    private static void EnterCave() throws IOException
    {
	System.out.println("The cave is very dark. Very very dark. Soon you cannot see where you\n" + 
			  "came in. Something brushes past your ear.\n" + 
			  "\t--1: Kill it!\n" + 
			  "\t--2: Grab it!\n" + 
			  "\t--3: Scream!");

	
	int _2 = getResponse(3);

	switch (_2)
	{
	    case 1:
		System.out.println("You don't have a bowtie, and cannot kill it. :(");
		EnterCave();
		break;
	    case 2:
		CatchAnimal();
		break;
	    default:
		System.out.println("It hears you and chases you too out of the cave, then disappears.");
		Start();
		break;
	}
    }

    private static void CatchAnimal() throws IOException
    {
	System.out.println("The thing is slimy, but you manage to grab it. It is a fish.\n" + 
			  "It opens its mouth, and bites you. You slowly die of the venom\n" + 
			  "as it nibbles your fingers.\n\nThe (fishy) End.\n\npress any key to continue...");
	System.in.read();
	System.exit(0);
    }

    private static void Teleport() throws IOException
    {
	System.out.println("You find yourself at a friend's house. You call your parents and return \n" + 
			  "home.\n\nThe End.\n\npress any key to continue...");
	System.in.read();
	System.exit(0);
    }
}
