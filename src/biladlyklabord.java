import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class biladlyklabord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<String> input = new ArrayList<>(Arrays.asList(sc.nextLine().split("")));
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.size(); i++)
        {
            if (i == input.size()-1){
                result.append(input.get(i));
            }
            else if(!(input.get(i+1).equals(input.get(i)))){
                result.append(input.get(i));
            }
        }
        System.out.println(result);
    }
}
