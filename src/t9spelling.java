import java.util.HashMap;
import java.util.Scanner;

public class t9spelling
{
    public static void main(String[] args)
    {
        HashMap<Character, String> conversions = new HashMap<>();
        conversions.put('a', "2");
        conversions.put('b', "22");
        conversions.put('c', "222");
        conversions.put('d', "3");
        conversions.put('e', "33");
        conversions.put('f', "333");
        conversions.put('g', "4");
        conversions.put('h', "44");
        conversions.put('i', "444");
        conversions.put('j', "5");
        conversions.put('k', "55");
        conversions.put('l', "555");
        conversions.put('m', "6");
        conversions.put('n', "66");
        conversions.put('o', "666");
        conversions.put('p', "7");
        conversions.put('q', "77");
        conversions.put('r', "777");
        conversions.put('s', "7777");
        conversions.put('t', "8");
        conversions.put('u', "88");
        conversions.put('v', "888");
        conversions.put('w', "9");
        conversions.put('x', "99");
        conversions.put('y', "999");
        conversions.put('z', "9999");
        conversions.put(' ', "0");

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < testCases; i++)
        {
            String sentence = sc.nextLine();
            int lastDigit = -1;
            System.out.print("Case #" + (i+1) + ": ");
            for (char charachter : sentence.toCharArray())
            {
                if (lastDigit == Integer.parseInt(conversions.get(charachter).substring(0, 1)))
                {
                    System.out.print(" ");
                }
                System.out.print(conversions.get(charachter));

                lastDigit = Integer.parseInt(conversions.get(charachter).substring(0, 1));
            }
            System.out.println();
        }
    }
}
