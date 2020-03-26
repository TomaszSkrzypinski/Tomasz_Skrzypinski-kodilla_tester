public class Loops {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 5;
        numbers[1] = -9;
        numbers[2] = 4;
        sumNumbers(numbers);
    }

    public static int sumNumbers(int[] numbers) {


        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
           }
        int sumResult = result;
        System.out.println("Wynik wynosi: " + sumResult);

        return result;
    }
}
