import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[ ] args) {
        System.out.println("Массивы_Часть_2");
        System.out.println();
        int[] arr = arrRandom();
        int sum = 0;
        for (int number : arr){
            sum += number;
        }
        System.out.println(sum);

        //Задание 2
        System.out.println("Задание 2");
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        //Задание 3
        System.out.println("Задание 3");
        System.out.println("Средний расход за месяц, составил: " + (double)sum/arr.length);

        //Задание 4
        System.out.println("Задание 4");
        String string = "Иванов Иван Иванович";
        char[] stringToChar = string.toCharArray();
        System.out.println(Arrays.toString(stringToChar));
        for (int i = stringToChar.length - 1; i>=0; i--){
            System.out.print(stringToChar[i]);
        }

    }

    public static int[] arrRandom() {

        //Задание 1
        System.out.println("Задание 1");
        Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}