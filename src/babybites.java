import java.util.Scanner;

public class babybites
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount = Integer.parseInt(sc.nextLine());
        boolean makesSense = true;

        String[] inputs = sc.nextLine().split(" ");

        for (int i = 1; i <= amount; i++)
        {
            if (inputs[i-1].equals("mumble")){
                continue;
            }

            if (Integer.parseInt(inputs[i-1]) != i) {
                makesSense = false;
                break;
            }
        }

        if (makesSense) System.out.println("makes sense");
        else System.out.println("something is fishy");
    }
}
