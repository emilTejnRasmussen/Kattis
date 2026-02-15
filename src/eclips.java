import java.util.Scanner;

public class eclips
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        boolean hasPrinted = false;
        for (String word : words){
            if (word.contains("e")) {
                System.out.print(word + " ");
                hasPrinted = true;
            }
        }

        if (!hasPrinted) System.out.println("oh noes");
    }
}
