import java.util.Scanner;

public class phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = Integer.parseInt(sc.nextLine());
        int count = 0;

        for (int i = 0; i < numbers; i++) {
            String number = sc.nextLine();
            boolean correctLength = (number.length() == 12) || (number.length() == 13);
            if (number.startsWith("+39") && correctLength) count++;
        }

        System.out.println(count);
    }
}
