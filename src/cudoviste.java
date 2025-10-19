import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cudoviste
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(); sc.nextLine();
        List<List<Character>> map = new ArrayList<>();
        for (int i = 0; i < r; i++)
        {
            String line = sc.nextLine();
            List<Character> row = new ArrayList<>();
            for (char ch : line.toCharArray()){
                row.add(ch);
            }
            map.add(row);
        }

        int[] counts = new int[5];

        for (int i = 0; i < r-1; i++)
        {
            for (int j = 0; j < c-1; j++)
            {
                ArrayList<Character> subGrid = getSubArray(i, j, map);
                if (subGrid.contains('#')){
                    continue;
                }
                int count = 0;
                for (char ch : subGrid){
                    if (ch == 'X'){
                        count++;
                    }
                }
                counts[count]++;
            }
        }

        for (int count : counts){
            System.out.println(count);
        }
    }

    private static ArrayList<Character> getSubArray(int row, int col, List<List<Character>> map)
    {
        return new ArrayList<>(List.of(new Character[]{map.get(row).get(col), map.get(row).get(col + 1), map.get(row + 1).get(col), map.get(row + 1).get(col + 1)}));
    }
}
