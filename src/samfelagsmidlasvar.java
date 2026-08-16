import java.util.Scanner;

public class samfelagsmidlasvar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        System.out.println(input[input.length - 1] + "slop");
    }
}
