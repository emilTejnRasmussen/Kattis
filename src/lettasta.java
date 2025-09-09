import java.util.Scanner;

public class lettasta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());

        String[] teams = sc.nextLine().split(" ");
        int[] scores = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                scores[j] += sc.nextInt();
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (scores[i] > scores[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println(teams[maxIndex]);

        sc.close();
    }
}
