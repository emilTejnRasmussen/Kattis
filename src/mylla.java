import java.util.Scanner;

public class mylla
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();

        int arnarRounds = 0, hannesRounds = 0;
        int arnarWins = 0, hannesWins = 0;

        for (char c : input.toCharArray()) {
            if (c == 'A') arnarWins++;
            else hannesWins++;

            if (arnarWins == 3) {
                arnarRounds++;
                arnarWins = 0;
                hannesWins = 0;
            } else if (hannesWins == 3)
            {
                hannesRounds++;
                hannesWins = 0;
                arnarWins = 0;
            }

            if (arnarRounds == n || hannesRounds == n) break;
        }

        if (arnarRounds > hannesRounds) System.out.println("Hannes");
        else System.out.println("Arnar");
    }
}
