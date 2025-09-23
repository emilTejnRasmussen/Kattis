import java.util.HashSet;
import java.util.Scanner;

public class karte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        HashSet<String> seen = new HashSet<>();
        int[] count = new int[4]; // P, K, H, T
        for (int i = 0; i < input.length(); i += 3) {
            String card = input.substring(i, i + 3);
            if (seen.contains(card)) {
                System.out.println("GRESKA");
                return;
            }
            seen.add(card);

            char suit = card.charAt(0);
            switch (suit) {
                case 'P' -> count[0]++;
                case 'K' -> count[1]++;
                case 'H' -> count[2]++;
                case 'T' -> count[3]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print((13 - count[i]) + (i < 3 ? " " : "\n"));
        }
    }
}