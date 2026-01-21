import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class hitastig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer.parseInt(sc.nextLine());
        List<String> nums =  Arrays.stream(sc.nextLine().split(" ")).toList();

        int max = nums.stream().mapToInt(Integer::parseInt)
                .max().orElseThrow();
        int min = nums.stream().mapToInt(Integer::parseInt)
                .min().orElseThrow();;

        System.out.printf("%d %d", max, min);
    }
}