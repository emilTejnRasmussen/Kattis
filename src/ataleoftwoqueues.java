import java.util.Scanner;

public class ataleoftwoqueues
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int leftAmount = sc.nextInt(), rightAmount = sc.nextInt();
        int sumLeft = 0; int sumRight = 0;
        for (int i = 0; i < leftAmount; i++)
        {
            sumLeft += sc.nextInt();
        }
        for (int i = 0; i < rightAmount; i++)
        {
            sumRight += sc.nextInt();;
        }
        if (sumLeft < sumRight){
            System.out.println("left");
        } else if (sumLeft > sumRight)
        {
            System.out.println("right");
        } else {
            System.out.println("either");
        }
    }
}
