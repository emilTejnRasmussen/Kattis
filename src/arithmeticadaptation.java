import java.util.Scanner;

public class arithmeticadaptation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nString = "" + n;

        if (nString.length() > 3){
            if (n % 2 == 0){
                System.out.println(n/2 + " " + n/2);
            } else {
                n--;
                System.out.println(n/2 + " " + ((n/2) + 1));
            }
        }
        else if (n-1 == 0){
            System.out.println((n + 1) + " " + -1);
        } else {
            System.out.println((n - 1) + " " + 1);
        }
    }
}
