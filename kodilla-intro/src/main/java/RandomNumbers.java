import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        RandomNumbers numbers = new RandomNumbers();

        numbers.getMaxRandomValue();

        int maxRandomValue = numbers.getMaxRandomValue();
        int minRandomValue = numbers.getMinRandomValue();

        System.out.println(maxRandomValue);
        System.out.println(minRandomValue);
    }

    public int getMaxRandomValue() {
        Random random = new Random();
        int maxTemp = 0;
        int sum = 0;
        while (sum <= 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            while (temp > maxTemp) {
                maxTemp = temp;
            }
        }
        return maxTemp;
    }

    public int getMinRandomValue() {
        Random random = new Random();
        int sum = 0;
        int minTemp = 30;
        while (sum <= 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            while (temp < minTemp) {
                minTemp = temp;
            }
        }
        return minTemp;
    }

}