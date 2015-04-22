import java.sql.Date;


public class BruteForce3
{
    public String username = new String();
    public static String password = "ZZZZZ";
    public static char[] charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static char[] currentGuess = new char[1];

public static void bruteForce()
    {
        String attempt = new String();
        Date start = new Date(0);
        while (true)
        {
            if (attempt.equals(password))
            {
                Date end = new Date(0);
                System.out.println("Password: " + attempt + "\nTotal time to crack: " + ((end.getTime() - start.getTime()) / 1000) + " seconds." + "\n");
                break;
            }
            attempt = in.toString();
            // System.out.println("Tried: " + attempt);
            in.increment();
        }
    }

    public BruteForceTest()
    {
        Arrays.fill(currentGuess, charset[0]);
    }

    public void increment()
    {
        int index = currentGuess.length - 1;
        while (index >= 0)
        {
            if (currentGuess[index] == charset[charset.length - 1])
            {
                if (index == 0)
                {
                    currentGuess = new char[currentGuess.length + 1];
                    Arrays.fill(currentGuess, charset[0]);
                    break;
                }
                else
                {
                    currentGuess[index] = charset[0];
                    index--;
                }
            }
            else
            {
                currentGuess[index] = charset[Arrays.binarySearch(charset, currentGuess[index]) + 1];
                break;
            }
        }
    }

    public String toString()
    {
        return String.valueOf(currentGuess);
    }
}