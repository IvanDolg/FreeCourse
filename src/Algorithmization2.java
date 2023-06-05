import java.util.Arrays;
import java.util.Random;

public class Algorithmization2 {
    public static void main(String[] args) {
        //sort0();
        //sort1();
        sort2();
    }
    //---- Одномерные массивы. Сортировки ----
    // Сортировка выбором. Дана последовательность чисел.Требуется переставить элементы так,
    // чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
    // элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
    // повторяется. Написать алгоритм сортировки выбором
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
        System.out.println("This is your sort array: " + Arrays.toString(array));
    }
    // Сортировка обменами. Дана последовательность чисел.Требуется переставить числа в
    // порядке возрастания. Для этого сравниваются два соседних числа. Если ai > ai+1, то делается
    // перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    // Составить алгоритм сортировки, подсчитывая при этом количества перестановок
    public static void sort1(){
        int[] array = new int[10];

        //  Random array
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println("This is your array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] < array[j]){
                    int tmp = array[j];
                    array [j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        System.out.println("This is your sort array: " + Arrays.toString(array));
    }
    // Сортировка вставками. Дана последовательность чисел. Требуется переставить числа в порядке
    // возрастания. Делается это следующим образом. Пусть a1, a2,... ,ai - упорядоченная последовательность, т. е.
    // a1 <= a2... <= ai. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
    // последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
    // не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
    // с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции
    public static void sort2(){
        int[] array = new int[10];
        int m = 0;
        int n = 0;
        int tmp;

        //  Random array
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println("This is your array: " + Arrays.toString(array));

        while (array[m] <= array[m + 1]){
            m++;
        }

        // ПЕРЕДЕЛАТЬ!!!
        for (int j = m + 1; j < array.length; j++){
            n = binarySearch(array, 0, j, array[j]);
            tmp = array[j];
            for (int k = j; k > n + 1; k--){
                array[k] = array[k - 1];
            }
            array[n + 1] = tmp;
        }
        System.out.println("This is your sort array: " + Arrays.toString(array));
    }

    static int binarySearch(int arr[], int start, int end, int elem) {
        if (end >= start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == elem)
                return mid;
            if (arr[mid] > elem)
                return binarySearch(arr, start, mid - 1, elem);
            return binarySearch(arr, mid + 1, end, elem);
        }
        return  -1;
    }
}
