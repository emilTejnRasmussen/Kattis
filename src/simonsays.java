import java.util.Scanner;

public class simonsays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int times = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < times; i++)
        {
            String simon = sc.nextLine();
            if (simon.contains("Simon says")){
                System.out.println(simon.replace("Simon says ", ""));
            }
        }
    }
}
