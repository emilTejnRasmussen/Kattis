import java.util.Scanner;

public class kanelbullar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] recipe = new int[5];

        for (int i = 0; i < 5; i++) {
            recipe[i] = sc.nextInt();
        }

        int max = sc.nextInt() / recipe[0];

        for (int i = 1; i < 5; i++) {
            int next = sc.nextInt() / recipe[i];
            if (next < max) max = next;
        }

        System.out.println(max);
    }
}
