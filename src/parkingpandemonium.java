import java.util.Scanner;

public class parkingpandemonium
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        int whyIsThisAnInput = sc.nextInt();
        int laps = sc.nextInt();
        System.out.println(minutes * laps);

    }
}
