import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class harshadnumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> digits = new ArrayList<>(Arrays.asList(input.split("")));
        int num = Integer.parseInt(input);
        int sum = getSum(digits);

        boolean harshedNumFound = false;
        while (!harshedNumFound)
        {
            if (num % sum == 0)
            {
                System.out.println(num);
                harshedNumFound = true;
            } else
            {
                num++;
                digits.clear();
                digits.addAll(Arrays.asList(String.format("%s", num).split("")));
                sum = getSum(digits);
            }
        }
    }

    static int getSum(List<String> digits)
    {
        int sum = 0;
        for (String digit : digits)
        {
            sum += Integer.parseInt(digit);
        }
        return sum;
    }
}
