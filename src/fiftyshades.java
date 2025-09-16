import java.util.Scanner;

public class fiftyshades
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()), count = 0;

        for (int i = 0; i < n; i++)
        {
            String color = sc.nextLine().toLowerCase();
            if (color.contains("pink") || color.contains("rose")){count++;}
        }
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("I must watch Star Wars with my daughter");
        }
    }
}
