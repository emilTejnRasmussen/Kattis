import java.util.Scanner;

public class mixedfractions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt(), b = sc.nextInt();
            if (a == 0 && b == 0){
                break;
            }

            int whole = a/b;
            int numRes = a - (whole * b);

            System.out.printf("%d %d / %d%n", whole, numRes, b);
        }
    }
}
