import java.util.Scanner;

public class stickykeys
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");

        StringBuilder result = new StringBuilder();

        for (String letter:input){
            if (!result.toString().endsWith(letter)){
                result.append(letter);
            }
        }

        System.out.println(result);
    }
}
