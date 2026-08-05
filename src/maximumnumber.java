import java.util.Scanner;

public class maximumnumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int input = sc.nextInt();

        while (input >= 0){
            max = Math.max(max, input);
            input = sc.nextInt();
        }

        System.out.println(max);

    }
}
