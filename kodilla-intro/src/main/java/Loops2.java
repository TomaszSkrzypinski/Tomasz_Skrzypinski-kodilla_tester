import java.util.Random;

public class Loops2 {
    public static void main(String[] args) {

       getCountOfRandomNumber(77);
    }

    public static int getCountOfRandomNumber ( int max){
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(10);
            sum = sum + temp;
            result++;
        }
        System.out.println(result);

        return result;

    }
}
