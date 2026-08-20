import java.util.Scanner;

public class spelapiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long keys = scanner.nextLong();
        int notes = scanner.nextInt();

        long position = 0;
        long lowest = 0;
        long highest = 0;

        for (int i = 0; i < notes - 1; i++) {
            position += scanner.nextLong();
            lowest = Math.min(lowest, position);
            highest = Math.max(highest, position);
        }

        long startingKey = 1 - lowest;
        if (startingKey + highest > keys) {
            System.out.println("finns ingen");
        } else {
            System.out.println(startingKey);
        }
    }
}
