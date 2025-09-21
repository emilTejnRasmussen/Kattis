import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class gettingwood
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>(Arrays.asList(sc.nextLine().split("")));
        boolean found = false;
        for (int i = 0; i < input.size()-3; i++)
        {
            if (input.get(i).equalsIgnoreCase("t") &&
                    input.get(i + 1).equals("r") &&
                    input.get(i + 2).equals("e") &&
                    input.get(i + 3).equals("e")){
                System.out.println(i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("no trees here");
        }
    }
}
