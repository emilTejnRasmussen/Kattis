import java.util.Scanner;

public class vandalism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String original = "UAPC";
        StringBuilder res = new StringBuilder();

        int i = 0;
        for (char c : original.toCharArray()) {
            if (i < s.length() && s.charAt(i) == c) {
                i++;
            } else {
                res.append(c);
            }
        }

        System.out.println(res);
    }
}