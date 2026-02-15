import java.util.Scanner;

public class tallenough
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean allTallEnough = true;

        for (int i = 0; i < n; i++)
        {
            if (sc.nextInt() < 48) {
                allTallEnough = false;
                break;
            }
        }

        System.out.println(allTallEnough ? "True" : "False");
    }
}
