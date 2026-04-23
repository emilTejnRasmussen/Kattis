import java.util.Scanner;

public class baddirections
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++)
        {
            System.out.println(decrypt(sc.nextInt(), sc.next()));
        }
    }

    private static String decrypt(int key, String numbers)
    {
        StringBuilder sb = new StringBuilder();

        for (String number : numbers.split("")) {
            int num = Integer.parseInt(number);
            String sum = (key + num) + "";
            if (sum.length() > 1) sb.append(sum.substring(1));
            else sb.append(sum);
        }
        return sb.toString();
    }
}
