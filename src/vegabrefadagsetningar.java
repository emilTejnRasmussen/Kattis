import java.util.Scanner;

public class vegabrefadagsetningar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] date = sc.nextLine().split(" ");

        System.out.printf("20%s-%s-%s%n", date[3], getMonth(date[2]), date[0]);
    }

    private static Object getMonth(String monthWritten)
    {
        return switch (monthWritten.substring(1)){
            case "JAN" -> "01";
            case "FEB" -> "02";
            case "MAR" -> "03";
            case "APR" -> "04";
            case "MAY" -> "05";
            case "JUN" -> "06";
            case "JUL" -> "07";
            case "AUG" -> "08";
            case "SEP" -> "09";
            case "OCT" -> "10";
            case "NOV" -> "11";
            case "DEC" -> "12";
            default -> "";
        };
    }
}
