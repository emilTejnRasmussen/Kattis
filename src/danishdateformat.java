import java.util.Arrays;
import java.util.Scanner;

public class danishdateformat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.nextLine().split("/");
        int day = Integer.parseInt(date[1]);
        System.out.printf("%d. %s %s", day, getMonth(date[0]), date[2]);
    }

    private static Object getMonth(String date) {
        String[] months = {
                "januar",
                "februar",
                "marts",
                "april",
                "maj",
                "juni",
                "juli",
                "august",
                "september",
                "oktober",
                "november",
                "december",
        };
        return months[Integer.parseInt(date) - 1];
    }
}
