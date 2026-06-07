import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class minesmotorcompany
{
    private static Map<String, Integer> convert = new HashMap<>();

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        fillConversionMap();

        int stationsToVisit = Integer.parseInt(sc.nextLine()) - 1;
        String startPos = "";
        String nextPos = sc.nextLine();

        int totalCount = 0;

        for (int i = 0; i < stationsToVisit; i++)
        {
            startPos = nextPos;
            nextPos = sc.nextLine();

            totalCount += calculateMoves(startPos, nextPos);
        }

        System.out.println(totalCount);

    }

    private static void fillConversionMap()
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alphabet.length(); i++)
        {
            convert.put(alphabet.charAt(i) + "", i);
        }
    }

    private static int calculateMoves(String startPos, String nextPos)
    {
        int ax = getIntValue(startPos.substring(0, 1));
        int ay = getIntValue(startPos.substring(1, 2));
        int bx = getIntValue(nextPos.substring(0, 1));
        int by = getIntValue(nextPos.substring(1, 2));

        return (Math.abs(ax - bx) + Math.abs(ay - by));
    }

    private static int getIntValue(String pos)
    {
        return convert.get(pos);
    }
}
