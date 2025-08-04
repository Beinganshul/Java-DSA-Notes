import java.util.*;
public class Loops {
   public static void main(String args[]){
     Scanner dc = new Scanner(System.in); 
    
    //*WE CAN ALSO USE CONDITIONAL STATEMENTS INSIDE ANOTHER CONDITIONAL STATEMENT OR INSIDE ANY LOOP 

    //*LOOPS

    //*WHILE LOOP


    int counter = 0;                         //*initializing the variable
    while (counter < 5) {                    //*CODITION TURE HONE KE BAAD BRACES KE ANDER KA SARA 
      System.out.println("Hello World!");    //*KAAM PRINT HOGA THEN UPDATION
      counter++;                             //*Har baari printkarne ke ke baad kya kaam karna hai
    }
    

     //?PRINT NUMBERS FROM 1 TO 10.


    // int i = 1;
    // while(i<=10){
    //   System.out.println(i);
    //   i++;
    // }

     //?PRINT NUMBERS FROM 1 TO "n"

    // System.out.println("Enter a number n");
    // int n = dc.nextInt();
    // int i = 1;
    // while(i<=n){
    //   System.out.println(i);
    //   i++;
    // }


     

    //?PRINT SUM OF FIRST N NATURAL NUMBERS.

  // System.out.println("Enter a number n");
  // int n = dc.nextInt();
  // int i = 1;
  // int sum = 0;
  // while(i<=n){
  //   sum = sum + i;
  //   i++;
  // }
  // System.out.println("Sum of first " + n + " natural numbers is " + sum);    
  

   //*++ THING GOOD TO REMEMBER

   //*FOR LOOP

  // for (int i = 1; i <= 10; i++) {
  //   System.out.println("Hello World");
  // }  


   //?PRINT A SQUARE PATTERN


  // for(int i = 1; i<=5; i++){
  //   System.out.println("*****");
  // }

   
   //?PRINT REVERSE OF A NUMBER


  // System.out.println("Enter a number");
  // int n = dc.nextInt(); 
  // while(n>0){
  //   System.out.print((double)n%10);
  //   n = n/10;
  // }  

   //?PRINT REVERSE OF A NUMBER AND SAVE THE REVERSED OF THE NUMBER IN A DIFFERENT VARIABLE.


  //  System.out.println("Enter a number");
  //  int n = dc.nextInt();
  //  int reversed = 0;
  //  while(n>0){
  //   System.out.print(reversed*10 + n%10);
  //   n = n/10;
  //  }


   //*DO WHILE LOOP ----- PEHELE KAAM KARATE HAIN PHIR CONDITION CHECK KARTE HAIN.

   //?PRINT NUMBER 1 TO 10 BY USING A DO WHILE LOOP.

  //  int i = 1;
  //  do{System.out.println(i);
  //    i++;
  //    }while(i<=10);          //*USE TERMINATOR IN DO WHILE LOOP.

   
   //*BREAK STATEMENT ---USED TO EXIT OR CLOSE THE LOOP.


   //?PRINT HELLO WORLD 10 TIMES AND STOP IT AT 8TH BY USING BREAK STATEMENT.


  // for (int i = 1; i <= 10; i++) {
  //   if(i==8){
  //     break;
  //   }
  //   System.out.println(i);
  // }  


   //?BREAK KEYWORD.


  //  do{
  //   System.out.print("Enter a number :");
  //   int i = dc.nextInt();
  //   if(i%10==0){
  //     break;
  //   }
  //   System.out.println(i);
  //  }
  //  while(true);  //*WHENEVER WE WANT THE LOOP NOT TO STOP WE CAN SIMPLY WRITE 'TRUE' IN CONDITION. 
                    //*IF WE DONT WANT ANY CONDITION 

   

   //*CONTINUE STATEMENT --- USED TO SKIP A STEP OR CONDITION AND CONITNUE THE REST.

  // for (int i = 1; i <= 10; i++) {
  //   if(i==8){
  //     continue;
  //   }
  //   System.out.println(i);
  // }  

   
   //?CONTINUE KEYWORD.


  //  do{
  //   System.out.print("Enter a number :");
  //   int i = dc.nextInt();
  //   if(i%10==0){
  //     continue;
  //   }
  //   System.out.println(i);
  //   }
  //   while(true); //*WHENEVER WE WANT THE LOOP NOT TO STOP WE CAN SIMPLY WRITE 'TRUE' IN CONDITION. 
                    //*IF WE DONT WANT ANY CONDITION.

   //?CHECK IF A NUMBER IS PRIME OR NOT.


    //*HAGGU CODE BY ONE AND ONLY ANSHUL

  //  System.out.println("Enter a number");
  //  int n = dc.nextInt();
  //  if (n == 2) {
  //     System.out.println("n is a prime number");
  //  } else {
  //        for(int i = 2; i<=n-1; i++){
  //            if(n%i==0){
  //              System.out.println("Not a prime number");
  //            }
  //            else{
  //                System.out.println("Prime number");
  //            }
  //        }
  //    }
   

   //*ERROR AARI HAI PAR PATA NAHI KYA ERROR HAI

  //  System.out.print("Enter a number");
  //  int n = dc.nextInt();
  //  if(n==2){
  //   System.out.println("n is a prime number");
  //  } else{
  //       boolean isPrime = true;
  //       for(int i=2; i<=n-1; i++){
  //          if(n % i == 0){
  //           isPrime = false;
  //           break;
  //          }
  //       }   
  //    if(isPrime == ture){
  //     System.out.println("n is a prime number");
  //    }else{
  //     System.out.println("n is not a prime number");
  //    }
  //  }                                                                    


      //*METHOD FOR LARGE NUMBERS

    // System.out.print("Enter a number: ");
    // int n = dc.nextInt();
    
    // if (n == 2) {
    //     System.out.println("n is a prime number");
    // } else {
    //     boolean isPrime = true;
    //     for (int i = 2; i <= Math.sqrt(n); i++) {
    //         if (n % i == 0) {
    //             isPrime = false;
    //             break; 
    //         }
    //     }
    //     if (isPrime == true) { 
    //         System.out.println("n is a prime number");
    //     } else {
    //         System.out.println("n is not a prime number");
    //     }
    // }
        
    //*ALTERNATE METHOD - CHAT GPT KO DHANYAVAAD.


    // System.out.print("Enter a number: ");
    // int n = dc.nextInt();

    // if (n == 2) {
    //     System.out.println("n is a prime number");
    // } else {
    //     boolean isPrime = true;
    //     for (int i = 2; i <= n-1; i++) {
    //         if (n % i == 0) {
    //             isPrime = false;
    //             break; 
    //         }
    //     }
    //     if (isPrime == true) {                         //*NESTED IF ELSE STATEMENTS.
    //         System.out.println("n is a prime number");
    //     } else {
    //         System.out.println("n is not a prime number");
    //     }
    // }
        
 
    //?WRITE A PROGRAM THAT READS SET OF INTEGERS THEN PRINT SUM OF EVEN AND ODD INTEGERS.
    
        
    // System.out.print("Enter the number of integers: ");
    // int count = dc.nextInt();
    
    // int sumEven = 0;
    // int sumOdd = 0;
    
    // System.out.println("Enter the integers:");
    // for (int i = 0; i < count; i++) {
    //     int number = dc.nextInt();
        
    //     if (number % 2 == 0) {
    //         sumEven += number;
    ////         System.out.println("Sum of even integers: " + sumEven);
    //     } else {
    //         sumOdd += number;
    ////         System.out.println("Sum of odd integers: " + sumOdd);
    //     }
    // }
    // System.out.println("Sum of even integers: " + sumEven);
    // System.out.println("Sum of odd integers: " + sumOdd);
        

      //*LOOP KE ANDAR JO BHI HOGA VO BAAR BAAR PRINT HOGA 
      //*TO JO CHEEJ HUM EK HI BAAR PRINT KARANA CHATE HAIN PAR OOSPE OPERATION 
      //*BAAR BAAR KARANA CHAHTE HAIN TO OOS VARIABLE KO LOOP KE PEHELE DECLARE KARO THEN
      //*LOOP KE ANDAR BAS OPERATION LIKHO, AUR PRINT KARANE KA BAHAR LIKHO.
      //*BAS KAAM HO JAYEGA.



    //?CORRECTED THING IS THIS 


    //System.out.print("Enter the number of integers: ");
    //int count = dc.nextInt();
    //
    //int sumEven = 0;
    //int sumOdd = 0;
    //
    //System.out.println("Enter the integers:");
    //for (int i = 0; i < count; i++) {
    //    int number = dc.nextInt();
    //    
    //    if (number % 2 == 0) {
    //        sumEven += number;
    //    } else {
    //        sumOdd += number;
    //    }
    //}
    //System.out.println("Sum of even integers: " + sumEven);
    //System.out.println("Sum of odd integers: " + sumOdd);


    //?FIND FACTORIAL OF A NUMBER.

    
    // System.out.println("Enter a number");
    // int n = dc.nextInt();
    // int factorial = 1;
    // for(int i =1; i<=n; i++){
    //   factorial *= i;
    // }
    // System.out.println("Factorial is " + factorial);
    

    //?WRITE A PROGRAM TO PRINT TABLE OF A NUMBER.


    // System.out.println("Enter a number");
    // int n = dc.nextInt();
    // for(int i = 1; i <= 10; i++){
    //   System.out.println(n + " * " + i + " = " + n * i); //*GOOD THING TO REMEMBER.
    // }


   }   
}   