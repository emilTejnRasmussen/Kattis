import java.math.BigInteger;
import java.util.Scanner;

public class sumofpowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pow = sc.nextInt();
        int amount = sc.nextInt();

        BigInteger sum = BigInteger.ZERO;
        BigInteger base = BigInteger.valueOf(pow);

        for (int i = 0; i < amount; i++) {
            sum = sum.add(base.pow(sc.nextInt()));
        }

        System.out.println(sum);
    }
}
