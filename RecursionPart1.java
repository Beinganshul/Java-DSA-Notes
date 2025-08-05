import java.util.*;

public class RecursionPart1 {



    //? Function to calculate Fibonacci number using recursion



    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }







    public static void main(String args[]) {
        Scanner dc = new Scanner(System.in);   




        //?CALCULATE FIBONACCI NUMBER USINNG RECURSION

        

        System.out.print("Enter the number of terms: ");
        int n = dc.nextInt();  // take input from user

        System.out.print("Fibonacci Series till " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

       
    }
}
