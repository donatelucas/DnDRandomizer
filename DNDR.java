import java.util.Scanner;

public class DNDR
{
    public static void main (String[] args)
    {
        Roll roll = new Roll();
        Government gov = new Government();
        Scanner scan = new Scanner(System.in);
        Dungeon dungeon = new Dungeon();
        int amount; String answer; boolean satisfied = false;
        roll.d20();
        roll.storedRoll();
        roll.resultPrint();
        dungeon.DeathTrap(roll.storedRoll());

        /*
        roll.d100();
        roll.storedRoll();
        roll.resultPrint();
        gov.formsOfGovernment(roll.storedRoll());

        */
    }
}
