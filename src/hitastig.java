import java.util.Scanner;

public class hitastig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println(max + " " + min);
    }
}