import java.util.Scanner;

public class doublepassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diffCount = 0;
        char[] p1 = sc.nextLine().toCharArray();
        char[] p2 = sc.nextLine().toCharArray();
        for (int i = 0; i < 4; i++) {
            if (p1[i] != p2[i]) diffCount++;
        }

        System.out.println(1 << diffCount);
    }
}
