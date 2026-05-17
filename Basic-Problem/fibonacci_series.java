// Fibonacci Series

import java.util.Scanner;

public class fibonacci_series{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();    // input

        int a = 0, b = 1;
        
        System.out.println("Fibonacci Series:");
        for (int i = 2; i <= n; i++) {
            System.out.print(a + " ");   // print fibonacci series
            int next = b;
            b = b + a;
            a = next;
        }
        System.out.println();
        System.out.println(b);
        sc.close();
    }
}