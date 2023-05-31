import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        scanner();
        getNnmber();
    }

    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    // ---- loops ----
    // 1 task
    // Let's write a program where the user enters any positive int num. And the program sums
    // up all the numbers from 1 to the number entered by the user.
    public static void getNnmber(){
        System.out.print("Write number: ");
        int num = scanner().nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("Sum from 1 to " + num + " is " + sum);
    }
    // 2 task
}