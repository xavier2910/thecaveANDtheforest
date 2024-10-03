import java.util.Scanner;
import java.io.IOException;

public class TheForest
    {
        public static void main(String[] args)
        {
            System.out.println("The Forest 1.1.0: A sequel to The Cave\n by Xavier\n\ntype the number of the option you want to \nchoose and press enter\n\n");
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
            System.out.println("You are standing at the entrance to a cave. Around you the \n" +
                              "forest is so thick that you can hardly see your hand in front of\nyour face. There " +
                              "is also a creek a few feet away.\n\t--1: Enter cave\n\t--2: Go to riverbank\n\t--3: Go upstream\n\t--4: Go downstream\n");
            int input = getResponse(4);
            switch (input)
            {
                case 1:
                    System.out.println("\nYou already did that...\n");
                    Start();
                    break;
                case 2:
                    GoToCreekbank();
                    break;
                case 3:
                    GoUpstream();
                    break;
                case 4:
                    GoDownstream();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    GoDownstream();
                    break;
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
                    System.out.printf("\nInvalid input ('%s' is not a number). Please try again.\n\ntype number> ", input);
                }

            }
            return num;
        }

        private static void GoToCreekbank() throws IOException
        {
            System.out.println("\n\nYou walk to the bank of the creek. The water is completely overshadowed\n" +
                              "by the tall conifer trees. A fish or two swims by. All is calm.\n\t--1: Go upstream\n\t--2: Go downstream\n\t--3: Cross\n");
            int input = getResponse(3);
            switch (input)
            {
                case 1:
                    GoUpstream();
                    break;
                case 2:
                    GoDownstream();
                    break;
                case 3:
                    CrossCreek();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    CrossCreek();
                    break;
            }
        }

        private static void CrossCreek() throws IOException
        {
            System.out.println("\n\nYou wade across the creek. The fishes nibble at your toes. You wonder\n" +
                              "if they are venomous. You make it across. The fishes were evidently\n" +
                              "not venomous after all. Beyond the trees you can see sunlight." + 
                              "\n\t--1: Go upstream\n\t--2: Go downstream\n\t--3: Go towards the light\n");
            int input = getResponse(3);
            switch (input)
            {
                case 1:
                    GoUpstream();
                    break;
                case 2:
                    GoDownstream();
                    break;
                case 3:
                    GoToSunlight();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    GoToSunlight();
                    break;
            }
        }

        private static void GoToSunlight() throws IOException
        {
            System.out.println("\n\nYou walk into a sparser part of the forest. Soon, the trees\n" +
                              "thin to nothing and you are walking in a plain. Snow begins to\n" +
                              "fall. Suddenly you stagger from internal pain. As the sun sets,\n" +
                              "you collapse to the ground. Perhaps the fish were poisonous after\n" +
                              "all.\n\npress any key to continue...");
            System.in.read(); 
            WakeUpInSnow();
        }


        private static void WakeUpInSnow() throws IOException
        {
            System.out.println("\n\nOvernight, the snow piled high. After you dig yourself up, you see\n" +
                              "someone a ways off towards the forest. A column of smoke betrays the\n" +
                              "presence of a fire.\n\t--1: Go over and greet the person.\n\t--2: Don't talk to strangers!--go the other way\n");
            int input = getResponse(2);
            switch (input)
            {
                case 1:
                    GoToPerson();
                    break;
                case 2:
                    GoAwayFromPerson();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    GoAwayFromPerson();
                    break;
            }
        }

        private static void GoToPerson() throws IOException
        {
            System.out.println("\n\nThe figure wears a tall, pointy red hat, matching your hood, and a\n" +
                              "long cloak. A staff lies on the ground beside him.\n\t--1: Greet him\n\t--2: Anarchist wizard! Run away!!\n");
            int input = getResponse(2);
            switch (input)
            {
                case 1:
                    GreetPerson();
                    break;
                case 2:
                    GoAwayFromPerson();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    GoAwayFromPerson();
                    break;
            }
        }

        private static void GreetPerson() throws IOException
        {
            System.out.println("\n\nYou walk up to him and wish him good day. He returns your greeting and\n" +
                              "invites you to share his breakfast. He begins chanting over the \n" +
                              "fire. It turns purple.\n\t--1: Anarchist wizard! Run away!!\n\t--2: Stay\n");
            int input = getResponse(2);
            switch (input)
            {
                case 1:
                    GoAwayFromPerson();
                    break;
                case 2:
                    StayWithWizard();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    StayWithWizard();
                    break;
            }
        }

        private static void StayWithWizard() throws IOException
        {
            System.out.println("\n\nYou are intrigued by the fire. You stay. The fire grows mesmer-\n" +
                              "izing. You stare deeper into it, despite your better judgement.\n\npress any key to continue...");
            System.in.read();
            TiedUpInLab();
        }

        private static void GoAwayFromPerson() throws IOException
        {
            System.out.println("\n\nHe and his cloud of smoke are soon out of sight. You trudge on in\n" +
                              "the snow. The temperature continues to drop. Your sweat freezes on\n" +
                              "your skin. The wind blows you over. You are unable to get up, you\n" +
                              "are so cold.\n\npress any key to continue...");
            System.in.read();
            TiedUpInLab();
        }

        private static void GoUpstream() throws IOException
        {
            System.out.println("\n\nYou walk slowly along. The day is hot and moisture oozes from the \n" +
                              "deciduous trees around you. You feel drowsy.\n\npress any key to continue...");
            System.in.read();
            TiedUpInLab();
        }

        private static void TiedUpInLab() throws IOException
        {
            System.out.println("\n\nYou wake up in a stark white room, tied to a...you can't tell what\n" +
                              "it is, but whatever it is, it is uncomfortable. A strange yellow furry\n" +
                              "creature in a lab coat walks up to you and says,\n\t\"" +
                                  "Good. You're awake. Now we can experiment. Tell me now, how do you\n" +
                              "feel about decapitation?\"\n\t--1: \"Disgusting\"\n\t--2: \"Wonderful!\"\n\t--3: Refuse to reply\n");
            int input = getResponse(3);
            switch (input)
            {
                case 1:
                    Decapitated_Disgusting();
                    break;
                case 2:
                    Decapitated_Wonderful();
                    break;
                case 3:
                    Decapitated_NoReply();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    Decapitated_NoReply();
                    break;
            }
        }

        private static void Decapitated_Disgusting() throws IOException
        {
            System.out.println("\n\n\t\"What a pity, since you will not leave here with your head. Glip,\n" +
                              "chop his head off.\"\n\nThe (headless) end.\n\npress any key to exit...");
            System.in.read();
            System.exit(0);
        }

        private static void Decapitated_Wonderful() throws IOException
        {
            System.out.println("\n\n\t\"Delightful! We will release you from these bonds shortly.\"\n" +
                              "He leaves.\n\npress any key to continue..."); 
            System.in.read();
            System.out.println("\n\nA few minutes later, another strange creature enters, also in a lab coat. He chops \n" +
                              "your head off, despite your pleas.\n\nThe (headless) end.\n\npress any key to exit...");
            System.in.read();
            System.exit(0);
        }

        private static void Decapitated_NoReply() throws IOException
        {
            System.out.println("\n\n\t\"Hmph. Well. Hmm.... This is difficult. This was unforseen. Glip,\n" +
                              "untie him. Hurry up, we haven't got all day! Good. Now follow me.\"\n\n" +
                              "He leads you down a bright corridor into a small room. He directs\n" +
                              "you to enter a small chamber. A hatch shuts behind you, sealing you in.\n" +
                              "A voice from a speaker in the wall instructs you to sit down in a chair\n" +
                              "and buckle yourself in. Before you know what to do, two robotic arms extract\n" +
                              "themselves from wall compartments and force you into your seat. They\n" +
                              "retract themseves and open a circular compartment in the wall. You hear\n" +
                              "a muffled explosion and are shoved into your seat. The compartment is\n" +
                              "actually a porthole. Through it you see stars.\n\npress any key to continue...");
            System.in.read();
            InSpacePod();
        }

        private static void InSpacePod() throws IOException
        {
            System.out.println("\n\nThe pod is your home for the next several weeks, fortunately\n" +
                              "supplied with adequate food and water. As peaceful the time is,\n" +
                              "and as beautiful the time may be, you grow lonely. You try to amuse\n" +
                              "yourself by counting the stars, thinking, and studying the back of\n" +
                              "your hand. Soon, you know the back of your hand as well as...the\n" +
                              "back of your hand.\n\npress any key to continue...");
            System.in.read();
            OnStrangePlanet();
        }

        private static void OnStrangePlanet() throws IOException
        {
            System.out.println("\n\nYou awake to a crushing sensation on your back. You look out the porthole\n" +
                              "and see flames licking the side of the pod. Soon, the crushing sensation\n" +
                              "stops and you are gently landed on a strange planet.\n\t--1: Exit pod\n\t--2: Check sensors\n\t--3: Rage at the creatures who put you in this pod!\n");
            int input = getResponse(3);
            switch (input)
            {
                case 1:
                    ExitPod();
                    break;
                case 2:
                    CheckSensors();
                    break;
                case 3:
                    RageAtCreatures();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    RageAtCreatures();
                    break;
            }
        }

        private static void ExitPod() throws IOException
        {
            System.out.println("\n\nYou search for a door. The closest thing you find is a red handle\nmarked \"EMERGENCY\"." +
                              "\n\t--1: Pull the handle\n\t--2: Check sensors\n\t--3: Rage at the creatures who put you in this pod!\n");
            int input = getResponse(3);
            switch (input)
            {
                case 1:
                    PullLever();
                    break;
                case 2:
                    CheckSensors();
                    break;
                case 3:
                    RageAtCreatures();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    RageAtCreatures();
                    break;
            }
        }

        private static void PullLever() throws IOException
        {
            System.out.println("\n\nA siren blares. An entire wall blasts off the side of the pod.\n" +
                              "You fall to the ground.\n\npress any key to continue...");
            System.in.read();
            WakeOnStrangePlanet();
        }

        private static void WakeOnStrangePlanet() throws IOException
        {
            System.out.println("\n\nYou awake to a barren but beautiful purple landscape dotted\n" +
                              "with black trees. A dim, orange sun hangs in the sky. A soft\n" +
                              "breeze brushes your cheek. You hear a long, lonesome song sung\n" +
                              "by a whale swimming overhead.\n\t--1: Hail the whale\n\t--2: Shoot the whale\n\t--3: Ignore the whale\n");
            int input = getResponse(3);
            switch (input)
            {
                case 1:
                    HailWhale();
                    break;
                case 2:
                    ShootWhale();
                    break;
                case 3:
                    IgnoreWhale();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    IgnoreWhale();
                    break;
            }
        }

        private static void HailWhale() throws IOException
        {
            System.out.println("\n\nYou call to the whale. It ignores you, leaving you to your death\n" +
                              "of thirst in this purple desert.\n\n\tThe End\n\npress any key to exit...");
            System.in.read();
            System.exit(0);
        }

        private static void ShootWhale() throws IOException
        {
            System.out.println("\n\nSadly, you lack weaponry. However, you remember something like\n" +
                              "a gun hanging in the pod.\n\t--1: Hail the whale" +
                              "\n\t--2: Return to the pod for the gun\n\t--3: Ignore the whale");
            int input = getResponse(3);
            switch (input)
            {
                case 1:
                    HailWhale();
                    break;
                case 2:
                    ReturnForGun();
                    break;
                case 3:
                    IgnoreWhale();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    IgnoreWhale();
                    break;
            }
        }

        private static void ReturnForGun() throws IOException
        {
            System.out.println("\n\nYou return to where the pod was. Nothing is there but a circle\n" +
                              "in the dirt.\n\t--1: Despair\n\t--2: Call for help\n\t--3: Step into the circle\n");
            int input = getResponse(3);
            switch (input)
            {
                case 1:
                    Despair();
                    break;
                case 2:
                    CallForHelp();
                    break;
                case 3:
                    StepOnCircle();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    StepOnCircle();
                    break;
            }
        }

        private static void Despair() throws IOException
        {
            System.out.println("\n\nYou die of deep, dark despair.\n\n\tThe End.\n\npress any key to exit...");
            System.in.read();
            System.exit(0);
        }

        private static void CallForHelp() throws IOException
        {
            System.out.println("\n\nYou shout at the top of your lungs. Something shoves you from behind.\n\npress any key to continue...");
            System.in.read();
            Falling();
        }

        private static void Falling() throws IOException
        {
            System.out.println("\n\nYou are falling, falling...\n\n" + 
                              "You wake up at school. Classes are about to start. Life returns to normal.\n\n\tThe End.\n\npress any key to exit...");
            System.in.read();
            System.exit(0);
        }

        private static void StepOnCircle() throws IOException
        {
            System.out.println("\n\nYou step into the circle. Nothing happens.\n\npress any key to continue...");
            System.in.read();
            Falling();
        }

        private static void IgnoreWhale() throws IOException
        {
            System.out.println("\n\nYou ignore the pesky whale and die of thirst in this purple\n" +
                              "desert.\n\n\tThe End\n\npress any key to exit...");
            System.in.read();
            System.exit(0);
        }

        private static void CheckSensors() throws IOException
        {
            System.out.println("\n\nYou look around for an instrument panel. Everything is unfamiliar-looking.\n" +
                              "the only familiar thing you see is a red handle marked \"EMERGENCY\"\n" +
                              "and a lit-up green button.\n\t--1: Exit pod\n\t--2: Pull the handle\n\t--3: Press the button" +
                              "\n\t--4: Rage at the creatures who put you in this pod!\n");
            int input = getResponse(4);
            switch (input)
            {
                case 1:
                    ExitPod();
                    break;
                case 2:
                    PullLever();
                    break;
                case 3:
                    PushButton();
                    break;
                case 4:
                    RageAtCreatures();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    RageAtCreatures();
                    break;
            }
        }

        private static void PushButton() throws IOException
        {
            System.out.println("\n\nYou press the button. It turns red. A door opens in the side\n" +
                              "of the pod. You climb out, but the ladder breaks and you fall\n" +
                              "to the ground.\n\npress any key to continue...");
            System.in.read();
            WakeOnStrangePlanet();
        }

        private static void RageAtCreatures() throws IOException
        {
            System.out.println("\n\nYou've raged and roared for ten minutes when a robotic arm reaches\n" +
                              "out of the wall. It holds a gun.\n\t" +
                                  "\"You have insulted my creators long enough,\" declares a voice.\n" +
                              "\"I shall now be obliged to kill you.\"\nThe gun goes off.\n\n\tThe End.\n\npress any key to exit...");
            System.in.read();
            System.exit(0);
        }

        private static void GoDownstream() throws IOException
        {
            System.out.println("\n\nYou walk quickly downstream, rubbing your hands against the cold.\n" + 
                              "The trees thin out, and snow begins to fall on the frozen-over\n" +
                              "creek. As it grows darker, it gets colder, and you huddle under-\n" + 
                              "neath your all to thin cloak. The snow stops and the stars come\n" +
                              "out. You continue fearing the consequences of stopping in the cold.\n" +
                              "The snow sparkles in the spectacular starlight. You see a light up\n" +
                              "ahead.\n\t--1: Go towards the light\n\t--2: Go away from it\n\t--3: Hunker down under your cloak for the night\n");
            int input = getResponse(3);
            switch (input)
            {
                case 1:
                    GoTowardsLight();
                    break;
                case 2:
                    GoAwayFromLight();
                    break;
                case 3:
                    HunkerDown();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    HunkerDown();
                    break;
            }
        }

        private static void GoTowardsLight() throws IOException
        {
            System.out.println("\n\nThe light reveals itself to be a strange metal tower. The light came\n" +
                              "from a beacon on top of it. Silhouetted by the light are three bulky\n" +
                              "figures.\n\t--1: Try to greet them\n\t--2: Go away from them\n");
            int input = getResponse(2);
            switch (input)
            {
                case 1:
                    GreetFigures();
                    break;
                case 2:
                    GoAwayFromLight();
                    break;
                default:
                    System.out.println("\nInvalid input. picking last option...");
                    GoAwayFromLight();
                    break;
            }
        }

        private static void GreetFigures() throws IOException
        {
            System.out.println("\n\nYou walk up to them, calling to them. They argue for a moment, but\n" +
                              "quickly agree. One of the figures walks up to you, and hits you in\n" +
                              "the head extremely hard indeed.\n\npress any key to continue...");
            System.in.read();
            TiedUpInLab();
        }

        private static void GoAwayFromLight() throws IOException
        {
            System.out.println("\n\nSpooked, you trudge away from the light. A storm moves in, and\n" +
                              "with it snow and wind. Soon, you cannot see your hand in front\n" +
                              "of your face. You trudge on, trying to keep moving. You collapse,\n" +
                              "exhausted.\n\npress any key to continue...");
            System.in.read();
            WakeUpInSnow();
        }

        private static void HunkerDown() throws IOException
        {
            System.out.println("\n\nYou gather your cloak about you, and settle down. The wind howls,\n" +
                              "snow falls, but somehow you fall asleep.\n\npress any key to continue...");
            System.in.read();
            WakeUpInSnow();
        }
    }

