import java.util.Scanner;

public class parity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String input = sc.nextLine();

            if (input.equals("#")) break;

            int oddCounter = 0;

            for (char num : input.toCharArray()){
                if (num == '1') oddCounter++;
            }
            boolean preIsEven = oddCounter % 2 == 0;
            boolean suffixIsEven = input.charAt(input.length() - 1) == 'e';

            if (preIsEven) {
                String suffix = suffixIsEven ? "0" : "1";
                System.out.println(input.substring(0, input.length() - 1) + suffix);
            } else {
                String suffix = suffixIsEven ? "1" : "0";
                System.out.println(input.substring(0, input.length() - 1) + suffix);
            }
        }
    }
}
