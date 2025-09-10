import java.util.Scanner;

public class forcedchoice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numOfCards = sc.nextInt(), secret = sc.nextInt(), steps = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < steps; i++)
        {
            int n = sc.nextInt();
            boolean secretFound = false;
            for (int j = 0; j < n; j++)
            {
                if (sc.nextInt() == secret){
                    secretFound = true;
                }
            }
            if (secretFound){
                System.out.println("KEEP");
            } else {
                System.out.println("REMOVE");
            }
        }
    }
}
