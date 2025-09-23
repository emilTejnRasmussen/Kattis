import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class quickbrownfox
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++)
        {
            ArrayList<String> letters = new ArrayList<>(Arrays.asList(
                    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                    "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                    "u", "v", "w", "x", "y", "z"
            ));

            String[] input = sc.nextLine().toLowerCase().split("");
            for (String in : input)
            {
                letters.remove(in);
            }

            if (letters.isEmpty())
            {
                System.out.println("pangram");
            } else
            {
                System.out.print("missing ");
                for (String letter : letters)
                {
                    System.out.print(letter);
                }
                System.out.println();
            }
        }
    }
}
