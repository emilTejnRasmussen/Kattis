import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class attemptedalphabet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Set<Character> letters = new HashSet<>();

        for (char letter : sc.nextLine().toCharArray()){
            letters.add(letter);
        }

        if (letters.size() == 26)
        {
            System.out.println("Good job!");
            return;
        }

        for( char letter = 'a'; letter <= 'z'; letter++){
            if (!letters.contains(letter)){
                System.out.print(letter);
            }
        }

    }
}
