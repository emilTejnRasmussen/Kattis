import java.util.Scanner;

public class bannord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String banned = sc.nextLine();
        String[] words = sc.nextLine().split(" ");

        for (String word : words) {
            boolean isRedacted = false;
            for (String letter : banned.split("")){
                if (isLetterInWord(word, letter))
                {
                    isRedacted = true;
                    break;
                }
            }
            System.out.print(((isRedacted ? "*".repeat(word.length()) : word) + " "));
        }

    }

    private static boolean isLetterInWord(String word, String letter)
    {
        return word.contains(letter);
    }
}
