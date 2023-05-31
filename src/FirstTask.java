import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        scanner();
        getNnmber();
        getSquaresNum();
    }

    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    // ---- loops ----
    // 1 task
    // Let's write a program where the user enters any positive int num. And the program sums
    // up all the numbers from 1 to the number entered by the user.
    public static void getNnmber(){
        System.out.println("\n\t\t ---- 1 TASK ----");
        System.out.print("Write number: ");
        int num = scanner().nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("Sum from 1 to " + num + " is " + sum);
    }
    // 2 task
    // Find the sum of the squares of the first hundred numbers.
    public static void getSquaresNum(){
        System.out.println("\n\t\t ---- 2 TASK ----");
        System.out.print("Write number: ");
        int num = scanner().nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++){
            sum += Math.pow(i, 2);
        }
        System.out.println("Sum of the squares from 1 to " + num + " is " + sum);
    }
}