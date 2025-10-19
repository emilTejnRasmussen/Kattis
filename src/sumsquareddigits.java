import java.util.Scanner;

public class sumsquareddigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++)
        {
            int testCase = sc.nextInt(), base = sc.nextInt(), num = sc.nextInt(), sum = 0;
            while (num > 0){
                int digit = num % base;
                sum += digit * digit;
                num /= base;
            }
            System.out.println(testCase + " " + sum);
        }
    }
}
