import java.util.*;

public class veci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();   // read input number as string

        char[] digits = s.toCharArray();

        if (nextPermutation(digits)) {
            System.out.println(new String(digits));
        } else {
            System.out.println(0);
        }
    }

    // modifies array to next permutation, returns true if exists
    private static boolean nextPermutation(char[] a) {
        int n = a.length;

        // 1. find first i from the right such that a[i] < a[i+1]
        int i = n - 2;
        while (i >= 0 && a[i] >= a[i+1]) {
            i--;
        }
        if (i < 0) return false; // no larger permutation possible

        // 2. find j from the right such that a[j] > a[i]
        int j = n - 1;
        while (a[j] <= a[i]) {
            j--;
        }

        // 3. swap a[i] and a[j]
        swap(a, i, j);

        // 4. reverse from i+1 to end
        reverse(a, i + 1, n - 1);

        return true;
    }

    private static void swap(char[] a, int i, int j) {
        char tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private static void reverse(char[] a, int i, int j) {
        while (i < j) {
            swap(a, i, j);
            i++;
            j--;
        }
    }
}
