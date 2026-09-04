import java.util.Scanner;

public class peasoup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amountOfRestaurants = Integer.parseInt(sc.nextLine());
        String nameOfRestaurant = "";
        boolean success = false;

        for (int i = 0; i < amountOfRestaurants; i++) {

            int dishes = Integer.parseInt(sc.nextLine());
            nameOfRestaurant = sc.nextLine();

            boolean isPancakes = false, isSoup = false;

            for (int j = 0; j < dishes; j++) {
                String dish = sc.nextLine();
                if (dish.equals("pea soup")) isSoup = true;
                if (dish.equals("pancakes")) isPancakes = true;
            }

            if (isPancakes && isSoup) {
                success = true;
                break;
            }
        }

        if (success) System.out.println(nameOfRestaurant);
        else System.out.println("Anywhere is fine I guess");
    }
}
