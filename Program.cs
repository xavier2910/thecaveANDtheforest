using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TheCave
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("The Cave v 1.1.0\n By Xavier\n\ntype the number of the option you want to choose and press enter\n\n");
            Start();
        }

        static void Start()
        {
            Console.WriteLine("You are looking into the mouth of a dark cave. Surrounding you \n" +
                              "are trees so thick you can hardly see your hands in front of your \n" +
                              "face. However, there is a teleporter nearby.\n" +
                              "\t--1: Enter cave\n" +
                              "\t--2: Teleport");

            Console.Write("type number> ");
            int _1 = GetInput(2);

            if (_1 == 1)
            {
                EnterCave();
            }
            else
            {
                Teleport();
            }
        }

        static int GetInput(int max)
        {
            bool gotNum = false;
            int num = 0;
            string input = "";
            while (!gotNum)
            {
                try
                {
                    input = Console.ReadLine();
                    num = int.Parse(input);
                    if (num > 0 && num <= max) {
                        gotNum = true;
                    } else {
                        Console.Write("Invalid input (there is no option {0}). Please select a valid option.\ntype number> ", num);
                    }
                    
                }
                catch (Exception)
                {
                    Console.Beep();
                    Console.Write("Invalid input ('{0}' is not a number). Please try again.\ntype number> ", input);
                }
                
            }
            return num;
        }

        static void EnterCave()
        {
            Console.WriteLine("The cave is very dark. Very very dark. Soon you cannot see where you\n" + 
                              "came in. Something brushes past your ear.\n" + 
                              "\t--1: Kill it!\n" + 
                              "\t--2: Grab it!\n" + 
                              "\t--3: Scream!");

            Console.Write("type number> ");
            int _2 = GetInput(3);

            switch (_2)
            {
                case 1:
                    Console.WriteLine("You don't have a bowtie, and cannot kill it. :(");
                    EnterCave();
                    break;
                case 2:
                    CatchAnimal();
                    break;
                default:
                    Console.WriteLine("It hears you and chases you too out of the cave, then disappears.");
                    Start();
                    break;
            }
        }

        static void CatchAnimal()
        {
            Console.WriteLine("The thing is slimy, but you manage to grab it. It is a fish.\n" + 
                              "It opens its mouth, and bites you. You slowly die of the venom\n" + 
                              "as it nibbles your fingers.\n\nThe (fishy) End.\n\npress any key to continue...");
            Console.ReadKey();
            Environment.Exit(0);
        }

        static void Teleport()
        {
            Console.WriteLine("You find yourself at a friend's house. You call your parents and return \n" + 
                              "home.\n\nThe End.\n\npress any key to continue...");
            Console.ReadKey();
            Environment.Exit(0);
        }
    }
}
