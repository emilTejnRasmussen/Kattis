import java.util.Scanner;

public class skocimis
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k1 = sc.nextInt(), k2 = sc.nextInt(), k3 = sc.nextInt();
        int biggestGap = 0;

        if (k2 - k1 > k3 - k2){
            biggestGap = k2 - k1;
        } else {
            biggestGap = k3 - k2;
        }

        System.out.println(biggestGap - 1);
    }
}
