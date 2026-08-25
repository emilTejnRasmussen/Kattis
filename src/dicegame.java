import java.util.Scanner;

public class dicegame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int gunnarSum = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        int emmaSum = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();

        if (gunnarSum == emmaSum) System.out.println("Tie");
        else if (gunnarSum > emmaSum) System.out.println("Gunnar");
        else System.out.println("Emma");
    }
}
