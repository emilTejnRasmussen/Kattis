import java.util.Scanner;

public class rps
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int p1Score = 0, p2Score = 0;

            String p1Input = sc.nextLine();
            String p2Input = sc.nextLine();

            if (p1Input.equals("E")) break;

            for (int i = 0; i < p1Input.length(); i++)
            {
                char p1Char = p1Input.charAt(i);
                char p2Char = p2Input.charAt(i);

                if (p1Char == p2Char) continue;
                if (hasWon(p1Char, p2Char)) p1Score++;
                else p2Score++;
            }

            System.out.printf("P1: %d%n", p1Score);
            System.out.printf("P2: %d%n", p2Score);
        }
    }

    private static boolean hasWon(char rpsPlayed, char againstRPS)
    {
        return rpsPlayed == 'R' && againstRPS == 'S' ||
                rpsPlayed == 'P' && againstRPS == 'R' ||
                rpsPlayed == 'S' && againstRPS == 'P';
    }
}
