import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        getCountOfRandomNumber(5000);
    }

    public static void getCountOfRandomNumber(int max) {
        Random random = new Random();

        int sum = 0;
        while (sum <= max) {
            int temp = random.nextInt(30);
            sum = sum + temp;

            int minTemp = 30;
            while (temp <= minTemp) {
                minTemp = temp;
            }

            int maxTemp = 0;
            while (temp > maxTemp) {
                maxTemp = temp;
            }
            System.out.println(minTemp);
            System.out.println(maxTemp);
        }
    }
}
