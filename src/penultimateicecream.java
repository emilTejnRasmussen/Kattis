import java.util.Scanner;

public class penultimateicecream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < amount; i++) {
            int num = sc.nextInt();
            if (largest < num) {
                secondLargest = largest;
                largest = num;
            } else if (secondLargest < num){
                secondLargest = num;
            }
        }

        System.out.println(secondLargest);
    }
}
