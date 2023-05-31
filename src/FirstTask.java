import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        scanner();
        getNnmber();
        getSquaresNum();
        getSquaresMultiplication();
        getSum();
        getSymbol();
        getDivider();
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
    // 3 task
    // Find the product of the squares of the first two hundred numbers.
    public static void getSquaresMultiplication(){
        System.out.println("\n\t\t ---- 3 TASK ----");
        System.out.print("Write number: ");
        int num = scanner().nextInt();
        double sum = 0;
        int multiplication = 1;

        for (int i = 1; i <= num; i++){
            sum = Math.pow(i, 2);
            multiplication *= sum;
        }
        System.out.println("Sum of the squares multiplication from 1 to " + num + " is " + multiplication);
    }
    // 4 task
    // Enter the number E. Find the sum of those terms of the series whose modulus is greater than or equal
    // to the given e.
    public static void getSum(){
        System.out.println("\n\t\t ---- 4 TASK ----");
        double a = 0;
        double sum = 0;
        double n = 1;

        System.out.print("Enter e num: ");
        double e = scanner().nextDouble();

        for (int i = 1; i <= n; i++){
            a = (1/Math.pow(2, n)) + (1/Math.pow(3, n));
            if (Math.abs(a) >= e){
                sum += a;
                n++;
            } else sum = 0;
        }
        System.out.println("General element: " + a);
        System.out.println("Number e: " + e);
        System.out.println("Sum is: " + sum);
    }
    // 5 task
    // Display the correspondences between the symbols and their
    // numerical designations in the computer memory.
    public static void getSymbol(){
        System.out.println("\n\t\t ---- 5 TASK ----");
        System.out.print("Enter symbol: ");
        char symbol = scanner().next().charAt(0);

        System.out.println(symbol + " - " + (int)symbol);
    }
    // 6 task
    // For each natural number in the range from m to n,
    // print all divisors except one and the number itself.
    // m and n are entered from the keyboard.
    public static void getDivider(){
        System.out.println("\n\t\t ---- 6 TASK ----");
        System.out.print("Enter m: ");
        int m = scanner().nextInt();
        System.out.print("Enter n: ");
        int n = scanner().nextInt();

        for (int i = m; i <= n; i++){
            System.out.println("\n\nNumber: " + i);
            System.out.print("Dividers: ");
            int count = 0;

            for(int j = 2; j <= n; j++){
                if (i == j){
                    continue;
                } else  if (i % j == 0 && j != n){
                    System.out.print(j + " ");
                    count ++;
                }
            }
            if (count == 0){
                System.out.println("No more divuders then 1 & " + i);
            }
        }
    }
}