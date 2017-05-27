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

    public int d20()
    {
        result = random.nextInt(20);
        return result;
    }

    public int d12()
    {
        result = random.nextInt(12);
        return result;
    }

    public int d10()
    {
        result = random.nextInt(10);
        return result;
    }

    public int d8()
    {
        result = random.nextInt(8);
        return result;
    }

    public int d6()
    {
        result = random.nextInt(6);
        return result;
    }

    public int d4()
    {
        result = random.nextInt(4);
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
