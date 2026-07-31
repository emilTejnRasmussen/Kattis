import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        if (isPalindrome(word)){
            System.out.println("Palindrome!");
        } else {
            System.out.println("Nothing special about this string :(");
        }
    }

    private static boolean isPalindrome(String word)
    {
        int length = word.length();

        for (int i = 0; i < length/2; i++)
        {
            if (!(word.charAt(i) == word.charAt(word.length() - 1 - i))){
                return false;
            }
        }

        return true;
    }
}
