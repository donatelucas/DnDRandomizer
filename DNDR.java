import java.util.Scanner;

public class DNDR
{
    public static void main (String[] args)
    {
        Roll roll = new Roll();
        Government gov = new Government();
        Scanner scan = new Scanner(System.in);
        Dungeon dungeon = new Dungeon();
        int amount; String answer; boolean satisfied = false; int choice;

        System.out.println("Welcome to the D&D Randomizer by d4wnbreaker.");
        System.out.println("At this moment, we just have two options, more options are being added daily.");
        System.out.println("You can suggest additions directly to him: @d4wnbreaker.");
        System.out.println("What do you want to roll?");
        System.out.println("Dungeons (1), Forms of Government (2)");
        choice = scan.nextInt();

        switch(choice)
        {
            case 1:
                roll.d20();
                roll.storedRoll();
                roll.resultPrint();
                dungeon.DeathTrap(roll.storedRoll());

                roll.d20();
                roll.storedRoll();
                roll.resultPrint();
                dungeon.Purpose(roll.storedRoll());

                roll.d20();
                roll.storedRoll();
                roll.resultPrint();
                dungeon.Maze(roll.storedRoll());

                roll.d20();
                roll.storedRoll();
                roll.resultPrint();
                dungeon.Mine(roll.storedRoll());

                roll.d100();
                roll.storedRoll();
                roll.resultPrint();
                dungeon.PlanarGate(roll.storedRoll());
            break;

            case 2:
                roll.d100();
                roll.storedRoll();
                roll.resultPrint();
                gov.formsOfGovernment(roll.storedRoll());
            break;
        }
    }
}
