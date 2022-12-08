import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[ ] args) {
        System.out.println("Массивы_Часть_2");
        System.out.println();
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int number : arr){
            sum += number;
        }
        System.out.println(sum);
    }

    public static int[] generateRandomArray() {
        Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}