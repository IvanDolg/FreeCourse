import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Algorithmization1 {
    public static void main(String[] args) {
        //array0();
        array1();
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
}
