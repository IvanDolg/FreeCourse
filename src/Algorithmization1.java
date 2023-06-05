import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Algorithmization1 {
    public static void main(String[] args) {
        //array0();
        //array1();
        //array2();
        //array3();
        array4();
    }
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    // Задачи. Массивы массивов
    // 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    public static void array0(){
        int[][] array = new int[6][6];

        //  Random array
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(10);
            }
        }
        System.out.println("This is your array: ");
        for (int [] columns : array){
            for (int el : columns){
                System.out.print(el + "\t");
            }
            System.out.println();
        }
        System.out.println("\nThis is your new array: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (j % 2 != 0 && array[0][j] > array[5][j]){
                        System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
    // 2 Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
    public  static  void array1(){
        int[][] array = new int[6][6];

        //  Random array
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(10);
            }
        }
        System.out.println("This is your array: ");
        for (int [] columns : array){
            for (int el : columns){
                System.out.print(el + "\t");
            }
            System.out.println();
        }

        System.out.print("\nMain diagonal: ");
        for (int rows = 0; rows < array.length; rows++) {
            for (int columns = 0; columns < array[rows].length; columns++) {
                if (rows == columns){
                    System.out.print(array[rows][columns] + " ");
                }
            }
        }
        System.out.print("\nSecondary diagonal: ");
        for (int rows = 0; rows < (Math.min(array[0].length, array.length)); rows++) {
            System.out.print(array[rows][array[0].length - rows - 1] + " ");
        }
    }
    // 3 Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static void array2(){
        int[][] array = new int[6][6];

        //  Random array
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(10);
            }
        }
        System.out.println("This is your array: ");
        for (int [] columns : array){
            for (int el : columns){
                System.out.print(el + "\t");
            }
            System.out.println();
        }

        System.out.print("Enter line (k): ");
        int line = scanner().nextInt();
        System.out.print("Your line: ");
        for (int i = 0; i < array[line].length; i++){
            System.out.print(array[line][i] + " ");
        }

        System.out.print("\nEnter column (p): ");
        int column = scanner().nextInt();
        System.out.println("Your column: ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i][column]);
        }
    }
    // 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
    public static void array3(){
        int n = 6;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i % 2 == 0){
                    array[i][j] = j + 1;
                } else array[i][j] = n - j;
            }
        }
        System.out.println("This is your array: ");
        for (int [] columns : array){
            for (int el : columns){
                System.out.print(el + "\t");
            }
            System.out.println();
        }
    }
    // 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    public static void array4(){
        int n = 6;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                array[i][j] = i + 1;
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = n - i; j < n; j++){
                    array[i][j] = 0;

            }
        }
        System.out.println("This is your array: ");
        for (int [] columns : array){
            for (int el : columns){
                System.out.print(el + "\t");
            }
            System.out.println();
        }
    }
}
