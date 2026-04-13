import java.util.Scanner;

public class reverserot
{
    private static String values = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true){
            int rot = sc.nextInt();
            if (rot == 0) break;

            String sentence = sc.next();

            System.out.println(rotReverse(rot, sentence));
        }
    }

    private static String rotReverse(int rot, String sentence)
    {
        StringBuilder result = new StringBuilder();

        for (int i = sentence.length() - 1; i >= 0 ; i--)
        {
            result.append(rot(sentence.charAt(i), rot));
        }

        return result.toString();
    }

    private static char rot(char c, int rot)
    {
        int indexOfChar = (values.indexOf(c) + rot) % 28;

        return values.charAt(indexOfChar);
    }
}
