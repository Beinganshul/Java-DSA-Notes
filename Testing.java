// import java.util.Scanner;

// public class Testing {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter the number of integers: ");
//         int count = scanner.nextInt();
        
//         int sumEven = 0;
//         int sumOdd = 0;
        
//         System.out.println("Enter the integers:");
//         for (int i = 0; i < count; i++) {
//             int number = scanner.nextInt();
            
//             if (number % 2 == 0) {
//                 sumEven += number;
//             } else {
//                 sumOdd += number;
//             }
//         }
        
//         System.out.println("Sum of even integers: " + sumEven);
//         System.out.println("Sum of odd integers: " + sumOdd);
        
//         scanner.close();
//     }
// }




// import java.util.Scanner;

// public class Calculator {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.println("Simple Calculator");
//             System.out.println("Choose an operation:");
//             System.out.println("1: Addition");
//             System.out.println("2: Subtraction");
//             System.out.println("3: Multiplication");
//             System.out.println("4: Division");
//             System.out.println("5: Exit");

//             int choice = scanner.nextInt();

//             if (choice == 5) {
//                 System.out.println("Exiting...");
//                 break;
//             }

//             System.out.print("Enter first number: ");
//             double num1 = scanner.nextDouble();

//             System.out.print("Enter second number: ");
//             double num2 = scanner.nextDouble();

//             double result = 0;
//             boolean validOperation = true;

//             switch (choice) {
//                 case 1:
//                     result = num1 + num2;
//                     break;
//                 case 2:
//                     result = num1 - num2;
//                     break;
//                 case 3:
//                     result = num1 * num2;
//                     break;
//                 case 4:
//                     if (num2 != 0) {
//                         result = num1 / num2;
//                     } else {
//                         System.out.println("Error: Division by zero");
//                         validOperation = false;
//                     }
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//                     validOperation = false;
//             }

//             if (validOperation) {
//                 System.out.println("Result: " + result);
//             }
//         }

//         scanner.close();
//     }
// }





// import java.util.*;
// public class Testing {
//     public static void main(String args[]){
//         Scanner dc = new Scanner(System.in);
//         System.out.println("Hello World");
//     }

// }




// import java.util.*;
// public class Testing {


//     public static int linearSearch(int numbers[] , int key){
//         for(int i = 0; i<numbers.length; i++){
//             if(numbers[i] == key){
//             return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         Scanner dc = new Scanner(System.in);


//         int numbers[] = {10,20,30,40,50};
//         System.out.println("Enter the number you want to search");
//         int key = dc.nextInt();
//         int index = linearSearch(numbers, key);
//         if(index == -1){
//             System.out.println("Element not found");
//         }else{
//             System.out.println("Element found at index " + index);

//             }
//         }        
// }    









// import java.util.*;

// public class Testing {

//     public static int linearSearch(int numbers[], int key) {
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         Scanner dc = new Scanner(System.in);

//         int numbers[] = {10, 20, 30, 40, 50};
//         System.out.println("Enter the number you want to search:");
//         int key = dc.nextInt();
//         int index = linearSearch(numbers, key);
        
//         if (index == -1) {
//             System.out.println("Element not found");
//         } else {
//             System.out.println("Element found at index " + index);
//         }

       
//     }
// }




// import java.util.*;
// public class Testing {
//         public static void inverted_and_roated_half_pyramid(int rows){
//         for(int i=1; i<=rows; i++){
//             for(int j=1; j<=rows-i; j++){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=i; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner dc = new Scanner(System.in);
//         System.out.println("Enter the number of rows");
//         int rows = dc.nextInt();
//         inverted_and_roated_half_pyramid(rows)


import java.util.*;
public class Testing {
    public static void main(String args[]){
        System.out.println("Hello World");
    }
}
    

