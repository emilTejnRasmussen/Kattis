import java.util.Scanner;

public class ofugsnuid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n]; // faster than ArrayList

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }
}