import java.util.Arrays;
import java.util.Scanner;

public class radgreining1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(), sequences = sc.nextInt();
        Character[] sequence = new Character[length];
        boolean isVilla = false;

        for (int i = 0; i < sequences; i++)
        {
            int startPoint = sc.nextInt();
            String dnaFromStartPoint = sc.next();

            for (int j = 0; j < dnaFromStartPoint.length(); j++)
            {
                Character character = sequence[startPoint + j - 1];
                if (character != null && character != dnaFromStartPoint.charAt(j))
                {
                    isVilla = true;
                    break;
                }

                sequence[startPoint + j - 1] = dnaFromStartPoint.charAt(j);
            }
        }
        if (isVilla) System.out.println("Villa");
        else
        {
            for (Character dna : sequence)
            {
                if (dna == null) System.out.print("?");
                else System.out.print(dna);
            }
        }
    }
}
