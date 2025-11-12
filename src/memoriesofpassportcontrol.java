import java.util.Scanner;

public class memoriesofpassportcontrol
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), s = sc.nextInt();
        System.out.println(((int) s/k) + s % k);
    }
}
