import java.util.Scanner;

public class dfyrirdreki
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b*b - 4*a*c;
        if (d==0){
            System.out.println(1);
        } else if (d>0)
        {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
