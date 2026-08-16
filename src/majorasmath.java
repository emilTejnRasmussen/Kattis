import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class majorasmath
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int enemyHp = sc.nextInt(), arrowsHit = sc.nextInt();

        Map<String, Integer> damage = new HashMap<>(Map.of(
                "standard", sc.nextInt(),
                "fire", sc.nextInt(),
                "ice", sc.nextInt(),
                "light", sc.nextInt()
        ));

        sc.nextLine();

        for (int i = 0; i < arrowsHit; i++)
        {
            enemyHp -= damage.get(sc.nextLine());
            if (enemyHp < 1) break;
        }

        if (enemyHp < 1) System.out.println("dead");
        else System.out.println(enemyHp);
    }
}
