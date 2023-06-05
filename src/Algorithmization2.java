import java.util.Arrays;
import java.util.Random;

public class Algorithmization2 {
    public static void main(String[] args) {
        sort0();
    }
    //---- Одномерные массивы. Сортировки ----
    // Сортировка выбором. Дана последовательность чисел.Требуется переставить элементы так,
    // чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
    // элемент и ставится на первое место, а первый - на место наибольшего.
    // Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
    public static void sort0(){
        int[] array = new int[10];

        //  Random array
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println("This is your array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                pos = j;
                min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        System.out.println("Sort array: " + Arrays.toString(array));
    }
}
