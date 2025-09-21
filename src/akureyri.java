import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class akureyri
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int contestants = Integer.parseInt(sc.nextLine());
        Map<String, Integer> counts = new HashMap<>();

        for (int i = 0; i < contestants; i++)
        {
            sc.nextLine();
            String location = sc.nextLine();

            counts.put(location, counts.getOrDefault(location,0) + 1);
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
