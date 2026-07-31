import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class ascendingsquares
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numsToSquare = sc.nextInt();
        BigInteger[] result = new BigInteger[numsToSquare];

        for (int i = 1; i <= numsToSquare; i++)
        {
            result[i-1] = BigInteger.valueOf((long) Math.pow(i, 2));
        }

        System.out.println(Arrays.toString(result));
    }
}
