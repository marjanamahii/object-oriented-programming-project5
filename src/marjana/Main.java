package marjana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        Operation operation = new Operation();
        int a, b, sum;
        System.out.println("Please enter the value of a: ");
        a = input.nextInt();

        System.out.println("Please enter the value of a: ");
         b = input.nextInt();

         sum = operation.sum(a, b);
         System.out.println("Sum "+a+ " and " +b+ " = " +sum);
    }
}
