import java.util.Scanner;

public class lasagne
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = Math.toIntExact(Math.round((float) (f - 32) / 1.8));

        System.out.println(c);
    }
}
