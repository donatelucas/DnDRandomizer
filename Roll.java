import java.util.Random;

public class Roll
{
    private Random random = new Random();
    private int result; private int stored;

    public int d100()
    {
        result = random.nextInt(100);
        return result;
    }

    public int storedRoll()
    {
        stored = result;
        return stored;
    }

    public void resultPrint()
    {
        System.out.println("You rolled a " + storedRoll() + ".");
    }
}
