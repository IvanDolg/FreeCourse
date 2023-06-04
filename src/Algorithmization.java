import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Algorithmization {
    public static void main(String[] args) {
        //array0();
        array1();
        //array2();
        //array3();
    }
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    // Одномерные массивы
    // 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
    // которые кратны данному К.
    public static void array0(){
        int sum = 0;
        int[] array = new int[10];

        //  Random array
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println("This is your array: " + Arrays.toString(array));

        System.out.print("Enter number K: ");
        int number = scanner().nextInt();

        for (int el : array){
            if (el % number == 0){
                sum += el;
            }
        }
        System.out.print("Sum of el: " + sum);

    }
    // 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
    // Заменить все ее члены, большие данного Z, этим
    // числом. Подсчитать количество замен
    public static void array1(){
        int index = 0;
        int[] array = new int[10];

        //  Random array
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println("This is your array: " + Arrays.toString(array));

        System.out.print("Enter number Z: ");
        int number = scanner().nextInt();

        int [] resultArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (number < array[i]) {
                resultArr[index] = array[i];
                index++;
            } else if (number >= array[i]) {
                resultArr[index] = number;
                index++;
            }
        }
        System.out.print(Arrays.toString(resultArr));
    }
    // 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
    // положительных и нулевых элементов.
    public static void array2(){
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int[] array = new int[10];

        //  Random array
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println("This is your array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            } else if (array[i] < 0){
                count1++;
            } else if (array[i] == 0) {
                count2++;
            }
        }
        System.out.print(" + " + count);
        System.out.print("\n - " + count1);
        System.out.print("\n = " + count2);
    }
    // 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
    public static void array3(){
        int[] array = new int[5];
        int min = 0;
        int max = 0;

        //  Random array
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] =((int)(Math.random() * 12) + 1);
        }
        System.out.println("This is your array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max])
                max = i;
            if (array[i] < array[min])
                min = i;
        }

        int tmp = array[max];
        array[max] = array[min];
        array[min] =  tmp;
        System.out.println("This is your array: " + Arrays.toString(array));
    }
}
