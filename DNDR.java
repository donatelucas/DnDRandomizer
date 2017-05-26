import java.util.Scanner;
import java.util.Random;

public class DNDR
{
    public static void main (String[] args)
    {
        Random random = new Random();
        Government gov = new Government();
        Scanner scan = new Scanner(System.in);
        int amount; int rolls; String answer;
        System.out.println("How many results do you want?");
        amount = scan.nextInt();
        
        do {
            for (int i = 1; i <= amount; i++)
            {
                gov.formsOfGovernment();
                gov.resultPrint();
            }

            System.out.println("Are you satisfied? If yes, press 'y', otherwise, press anything else.");
            answer = scan.nextLine().toUpperCase();

            if (answer.equals("Y"))
            {
                System.out.println("Kk. Bye.");
                System.exit(0);
            }
        } while (answer != "Y");
    }
}
