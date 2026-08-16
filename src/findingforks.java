import java.util.Scanner;

public class findingforks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int amountOfForks = sc.nextInt();

        int leastAmount = Integer.MAX_VALUE, secondLeastAmount = Integer.MAX_VALUE;

        for (int i = 0; i < amountOfForks; i++)
        {
            int amountOfThisType = sc.nextInt();
            if (amountOfThisType < leastAmount) {
                secondLeastAmount = leastAmount;
                leastAmount = amountOfThisType;
            }
            else if (amountOfThisType < secondLeastAmount) secondLeastAmount = amountOfThisType;
        }

        System.out.println(leastAmount + secondLeastAmount);
    }
}
