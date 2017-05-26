import java.util.Scanner;
import java.util.Random;

public class DNDR
{
    public static void main (String[] args)
    {
        Random random = new Random();
        Government gov = new Government();
        Scanner scan = new Scanner(System.in);
        int amount; String answer; boolean satisfied = false;
        // System.out.println("What type of randomization do you want?");
        // System.out.println("Select a number from the list below:");
        // System.out.println("How many results do you want?");
        // amount = scan.nextInt();

        gov.d100();
        gov.storedRoll();
        gov.resultPrint();
        gov.formsOfGovernment(gov.storedRoll());

        /*
        do {
            for (int i = 1; i <= amount; i++)
            {
                gov.resultPrint();
                gov.formsOfGovernment();
                System.out.println();
            }

            System.out.println("Are you satisfied?");
            answer = scan.nextLine();

            if (answer.equals("Y"))
            {
                satisfied = true;
            }
            else if (!answer.equals("Y"))
            {
                satisfied = false;
                System.out.println("How many results do you want?");
                amount = scan.nextInt();
            }
        } while (satisfied = false);

        System.out.println("If you need any potions, please knock three times on the blue window.");
        System.exit(0); */
    }
}
