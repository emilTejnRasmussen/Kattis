import java.math.BigInteger;
import java.util.Scanner;

public class areal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        BigInteger area = sc.nextBigInteger();
        System.out.println(Math.sqrt(area.doubleValue()) * 4);
    }
}
