import java.util.Scanner;

public class mumblerap
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); // length of string (not really needed)
        String s = sc.nextLine();

        int maxNum = 0;
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                current.append(c);
            } else {
                if (!current.isEmpty()) {
                    int val = Integer.parseInt(current.toString());
                    maxNum = Math.max(maxNum, val);
                    current.setLength(0); // reset
                }
            }
        }

        // Final check in case string ends with a number
        if (!current.isEmpty()) {
            int val = Integer.parseInt(current.toString());
            maxNum = Math.max(maxNum, val);
        }

        System.out.println(maxNum);
    }
}