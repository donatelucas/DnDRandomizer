import java.util.Random;

public class Government
{
    // Dungeon Master's Guide 5th Edition pg 18
    private int result;

    public int roll()
    {
        Random random = new Random();
        result = random.nextInt(100);
        return result;
    }

    public void resultPrint()
    {
        System.out.println("The result was: " + roll() + ".");
    }

    public void formsOfGovernment()
    {
        roll();
        if (result == 0 || result <= 7)
        {
            System.out.println("The type of government is: Autocracy");
        }
        else if (result == 8 || result <= 12)
        {
            System.out.println("The type of government is: Bureaucracy");
        }
        else if (result == 13 || result <= 18)
        {
            System.out.println("The type of government is: Confederacy");
        }
        else if (result == 19 || result <= 21)
        {
            System.out.println("The type of government is: Democracy");
        }
        else if (result == 22 || result <= 26)
        {
            System.out.println("The type of government is: Dictatorship");
        }
        else if (result == 27 || result <= 41)
        {
            System.out.println("The type of government is: Feudalism");
        }
        else if (result == 42 || result <= 43)
        {
            System.out.println("The type of government is: Gerontocracy");
        }
        else if (result == 44 || result <= 52)
        {
            System.out.println("The type of government is: Hierarchy");
        }
        else if (result == 53 || result <= 55)
        {
            System.out.println("The type of government is: Magocracy");
        }
        else if (result == 56 || result <= 57)
        {
            System.out.println("The type of government is: Matriarchy");
        }
        else if (result == 58 || result <= 63)
        {
            System.out.println("The type of government is: Militocracy");
        }
        else if (result == 64 || result <= 73)
        {
            System.out.println("The type of government is: Monarchy");
        }
        else if (result == 74 || result <= 77)
        {
            System.out.println("The type of government is: Oligarchy");
        }
        else if (result == 78 || result <= 79)
        {
            System.out.println("The type of government is: Patriarchy");
        }
        else if (result == 80 || result <= 82)
        {
            System.out.println("The type of government is: Meritocracy");
        }
        else if (result == 83 || result <= 84)
        {
            System.out.println("The type of government is: Plutocracy");
        }
        else if (result == 85 || result <= 91)
        {
            System.out.println("The type of government is: Republic");
        }
        else if (result == 92 || result <= 93)
        {
            System.out.println("The type of government is: Satrapy");
        }
        else if (result == 94)
        {
            System.out.println("The type of government is: Kleptocracy");
        }
        else if (result == 95 || result <= 99)
        {
            System.out.println("The type of government is: Theocracy");
        }
        else
        {
            System.out.println("The number rolled was: " + result);
            System.out.println("Please talk to @d4wnbreaker about it. It's a glitch and your result came out empty for results. Sorry about that. Roll again.");
        }
    }
}
