import java.util.Scanner;

public class cube
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numberToCube = sc.nextInt();
        System.out.println((int) Math.pow(numberToCube, 3));
    }
}
