import java.math.BigInteger;
import java.util.Scanner;

public class lidaskipting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();
        System.out.println(n.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO) ? "Jebb" : "Neibb");
    }
}
