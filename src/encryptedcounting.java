import java.math.BigInteger;
import java.util.Scanner;

public class encryptedcounting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String key = sc.next();
        String cypher = sc.next(); sc.nextLine();

        int counter = 0;

        while (!key.equals(cypher)){
            key = nextTerm(key);
            counter++;
        }

        System.out.println(counter);

    }

    public static String nextTerm(String s) {
        StringBuilder result = new StringBuilder();

        int count = 1;
        char current = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == current) {
                count++;
            } else {
                result.append(count).append(current);
                current = s.charAt(i);
                count = 1;
            }
        }

        result.append(count).append(current);

        return result.toString();
    }
}
