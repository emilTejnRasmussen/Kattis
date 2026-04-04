import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class superyatzy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dice = sc.nextInt();
        int cheatsAllowed = sc.nextInt();
        int equalDiceNeeded = dice - cheatsAllowed;

        if (equalDiceNeeded <= 0) {
            System.out.println("Ja");
            return;
        }

        Map<Integer, Integer> rolls = new HashMap<>();

        for (int i = 0; i < dice; i++) {
            int roll = sc.nextInt();
            rolls.put(roll, rolls.getOrDefault(roll, 0) + 1);
        }

        boolean isYatzy = false;
        for (int count : rolls.values()) {
            if (count >= equalDiceNeeded) {
                isYatzy = true;
                break;
            }
        }

        System.out.println(isYatzy ? "Ja" : "Nej");
    }
}