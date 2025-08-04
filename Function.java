// import java.util.Scanner;

// public class Function {
//     public static void printHelloWorld(){          //*FUNCTION NAME RETURN TYPE AND INPUT
//         System.out.println("Hello World!");        //*FUNCTION WORK
//     }

//     public static void main(String[] args) {
//         Scanner dc = new Scanner(System.in);



//         printHelloWorld();                       //*FUNCTION CALL
//         printHelloWorld();
        

//         //*IF WE DONT HAVE A RETURN TYPE WE JUST USE VOID


import java.util.Scanner;
public class Function {
    


    //?MAKE A FUNCTION TO PRINT HELLO WORLD.



    public static void printHelloWorld(){      //*FUNCTION NAME RETURN TYPE AND INPUT
    System.out.println("Hello World!");        //*FUNCTION WORK
    System.out.println("Hello World!");        //*FUNCTION WORK
    return;                                    //*AGAR FUNCTION KA RETURN TYPE HOTA TO JITNI BAARI KAAM
    }                                          //*KIYA HOTA OOTNI BAARI RETURN HOTA TO '(RETURN 3;)'



    //?MAKE A FUNCTION TO PRINT SUM OF TWO NUMBERS.



    public static int calculatesum(int num1,int num2){    //*PARAMETERS OR FORMAL PARAMETERS
        int sum = num1 + num2;                           
        return sum;
    }
    


    //?MAKE A FUNCTION TO PRINT PRODUCT OF TWO NUMBERS.



    public static int calculateproduct(int num1, int num2){
        int product = num1 * num2;
        return product;
    }
    


    //?MAKE A FUNCTION TO FIND FACTORIAL OF ANY NUMBER N.



    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
            }
            return fact;
    }



    //?MAKE A FUNCTION TO CALCULATE BINOMIAL COEFFICIENT.



    public static int binomialcoefficient(int n ,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binomial = fact_n/(fact_r*fact_nmr);
        return binomial;
    }  



    //?FUNCTION OVERLOADING USING PARAMETERS .



    public static int sum (int num1, int num2){
        return num1 + num2;
    }
    public static int sum (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }



    //?FUNCTION OVERLOADING USING DATATYPES.



    public static int calculateadd (int num1, int num2){
        return num1 + num2;
    }
    public static float calculateadd (float num1, float num2, float num3){
        return num1 + num2 + num3;
    }



    //?MAKE A FUNCTION TO CHEAK IF A NUMBER IS PRIME OR NOT.



    // public static boolean isprime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i = 2; i<=n-1; i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }



    //?MORE MODIFIED WAY OF THIS.



    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
            // else{
            //     return true;
            // }
        }
        return true;
    }



    //?MAKE A FUNCTION WHICH PRINTS ALL PRIME NUMBERS IN A GIVEN RANGE.



    public static void printallprimes(int n){
        for(int i = 2; i<=n; i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
        System.out.println();
        return;
    }



    //?MAKE A FUNCTION TO CHECK WEATHER A NUMBER IS BINARY OR N0T.


    
    public static boolean isBinary(int number) {
        if (number < 0) {
            return false;
        }
        String numberString = String.valueOf(number);
        for (char ch : numberString.toCharArray()) {
            if (ch != '0' && ch != '1') {
                return false;
            }
        }
        return true;
    }

    



    //?MAKE A FUNCTION TO CONVERT A BINARY NUMBER TO DECIMAL.



    // public static int binToDec(int binNum){
    //     int pow = 0;
    //     int decNum = 0;
    //     while(binNum>0){
    //         int lasdtdigit = binNum % 10;
    //         decNum += lasdtdigit * (int)Math.pow(2, pow);
    //         pow++;
    //         binNum = binNum/10;
    //     }
    //     return decNum;
    // }



    public static int binToDec(int binNum){
        int pow = 0;
        int decNum = 0;
        if(isBinary(binNum)){
            while(binNum>0){
            int lasdtdigit = binNum % 10;
            decNum += lasdtdigit * (int)Math.pow(2, pow);
            pow++;
            binNum = binNum/10;
        }
        }else{
            System.out.println("Not a binary number");
        }
        return decNum;
    }



    //?MAKE A FUNCTION WHICH FINDS THE BINARY OF A DECIMAL NUMBER.



    public static int decTobin(int decNum){
        int pow = 0;
        int binNum = 0;
        while(decNum>0){
            int rem = decNum % 2;
            binNum += rem * (int)Math.pow(10, pow);
            pow++;
            decNum = decNum / 2;
        }
        return binNum;
    }



    //?MAKE A FUNCTION TO  CALCULATE AVERAGE OF THRERE NUMBERS.



    public static float average(int num1, int num2, int num3){
        float avg = (num1 + num2 + num3)/3;
        return avg;
    }



    //?MAKE A FUNCTION TO CHECK WEATHER A NUMBER IS EVEN OR NOT



    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }



    //?MAKE A FUNCTION TO CHECK WEATHER A NUMBER IS PALINDROME OR NOT.



    // public static boolean palindrome(int n){
    //     double p = 0;
    //     while(n>0){
    //         p = (double)n%10;
    //         n = n/10;
    //     }
    //     if(p==n){
    //         return true;
    //     }
    //     return false;
    // }
    public static boolean palindrome(int n){
        int rev = 0;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        if(rev==n){
            return true;
        }
        return false;
    }
    


    //?MAKE A FUNCTION TO COMPUTE SUM OF THE DIGITS OF AN INTEGER.



    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int lastdigit = n%10; 
            sum = sum + lastdigit;
            n = n/10;
        }
        return sum;
    }





    


    public static void main(String args []) {
        Scanner dc = new Scanner(System.in);
        


        //?FIND HELLO WORLD.



        // printHelloWorld();



        //?FIND SUM OF 2 NUMBERS.



        // int a = dc.nextInt();
        // int b = dc.nextInt();
        // int add = calculatesum(a,b);                     //*ARGUMENTS OR ACTUAL PARAMETERS
        // System.out.println(add);



        //?FIND PRODUCT OF 2 NUMBERS.



        // System.out.println("enter a number");
        // int a = dc.nextInt();
        // System.out.println("enter a number");
        // int b = dc.nextInt();
        // int product = calculateproduct(a,b);
        // System.out.println(product);



        //?FIND FACTORIAL OF A NUMBER.
        


        // System.out.println("Enter a number");
        // int n = dc.nextInt();
        // int fact = factorial(n);
        // System.out.println("Factorial of " + n + " is " + fact);


        
        //?FIND BINOMIAL COEFFICIENT OF A NUMBER.



        // System.out.println("Enter a number 'n' ");
        // int n = dc.nextInt();
        // System.out.println("Enter a number 'r' ");
        // int r = dc.nextInt();
        // int binomial_coefficient = binomialcoefficient(n, r);
        // System.out.println("Binomial coefficient is " + binomial_coefficient);



        //?FIND SUM OF TWO OR THREE NUMBERS USING FUNCTION OVER LOADING.



        // System.out.println("Enter a number");
        // int a = dc.nextInt();
        // System.out.println("Enter a number");
        // int b = dc.nextInt();
        // System.out.println("Enter a number");
        // int c = dc.nextInt();
        // int sum = sum(a,b);
        // int add = sum(a,b,c);
        // System.out.println("Sum of " + a + " and " + b + " is " + sum);
        // System.out.println("sum of " + a + " and " + b + " and " + c + " is " + add);



        //?FIND  SUM OF FLOAT AND INTEGER VALUES.



        // System.out.println("Enter a float number");
        // float a = dc.nextInt();
        // System.out.println("Enter a float number");
        // float b = dc.nextInt();
        // System.out.println("Enter a floatnumber");
        // float c = dc.nextInt();
        // System.out.println("Enter a integer number");
        // int d = dc.nextInt();
        // System.out.println("Enter a integer number");
        // int e = dc.nextInt();
        // int sum = calculateadd(d,e);
        // float add = calculateadd(a,b,c);
        // System.out.println("Sum of " + d + " and " + e + " is " + sum);
        // System.out.println("sum of " + a + " and " + b + " and " + c + " is " + add);



        //?CHECK WEATHER A NUMBER IS PRIME OR NOT.


    
        // System.out.println("Enter a number");
        // int a = dc.nextInt();
        // boolean prime_or_not = isprime(a);
        // System.out.println("Is " + a + " is prime number " + prime_or_not);



        //?PRINT ALL PRIME NUMBERS BETWEEN 1 TO N.



        // System.out.println("Enter a number");
        // int n = dc.nextInt();
        // printallprimes(n);


        //System.out.println(printallprimes(20));    //*ISKE KE LIYE HUME VOID KI JAGAH INT DENA HOGA
                                                     //*AUR REURN STATEMENT BHI DENI HOGI  
                                                     //*WHENEVER WE HAVE PRINTING STATEMENT IS IN THE
                                                     //*FUNCTION WE ARE MAKING VOID WIIL BE USED 
                                                     //*BECAUSE IT IS RETURNING NOTHING.

        //?CHECK WEATHER A NUMBER IS BINARY OR N0T.



        // System.out.println("Enter a number");
        // int a = dc.nextInt();
        // boolean binary_or_not = isBinary(a);
        // System.out.println("Is " + a + " a binary number - " + binary_or_not);



        //?FIMD DECIMAL OF A BINARY NUMBER.



        // System.out.println("Enter a binary number");
        // int a = dc.nextInt();
        // int decimal = binToDec(a);
        // // System.out.println("Decimal of " + a + " is " + decimal);
        // if(isBinary(a)){
        //     System.out.println("Decimal of " + a + " is " + decimal);
        // }
        // // else{
        // //     System.out.println("Not a binary number");
        // // }`



        //?FIND THE BINARY OF A DECIMAL NUMBER.



        // System.out.println("Enter a decimal number");
        // int a = dc.nextInt();
        // int binNum = decTobin(a);
        // System.out.println("Binary of " + a + " is " + binNum);


        
        //?METHOD SCOPE.


        // System.out.println(a);   //*ERROR AAYEGI HUMMNE A KO JAHA DEFINE KIYE HAI OSSEPEHELE 
        // int a = 10;              //*PRINT KARA RAHE HAIN.
        // System.out.println(a);   //* AUR IS FUNCTION KE BAHAR KAHI BHI USE NAHI KAR SKTE.



        //?BLOCK SCOPE.


        //     int a = 10;
        // {
        //     System.out.println(b);   //*ERROR AAYEGI HUMMNE B KO JAHA DEFINE KIYE HAI OSSEPEHELE
        //     int b = 20;
        //     System.out.println(a);   //*METHOD SCOPE LAGEGA YAHAN PAR.
        // }
        


        //?FIND AVERAGE OF THREE NUMBERS.



        // System.out.println("Enter a number");
        // int a = dc.nextInt();
        // System.out.println("Enter a number");
        // int b = dc.nextInt();
        // System.out.println("Enter a number");
        // int c = dc.nextInt();
        // float avg = average(a,b,c);
        // System.out.println("Average of " + a + " and " + b + " and " + c + " is " + avg);



        //?MAKE A FUNCTION TO CHECK WEATHER A NUMBER IS EVEN OR NOT.



        // System.out.println("Enter a number");
        // int a = dc.nextInt();
        // boolean even_or_not = isEven(a);
        // System.out.println("Is " + a + " is even number " + even_or_not);



        //?MAKE A FUNCTION TO CHECK WEATHER A NUMBER IS PALINDROME OR NOT.



        // System.out.println("Enter a number");
        // int a = dc.nextInt();
        // boolean palindrome_or_not = palindrome(a);
        // System.out.println("Is " + a + " is palindrome number " + palindrome_or_not);



        //?COMPUTE SUM OF THE DIGITS OF AN INTEGER.



        // System.out.println("Enter an integer");
        // int a = dc.nextInt();
        // int sum = sumOfDigits(a);
        // System.out.println("Sum of the digits of " + a + " is " + sum);



       

    



    }
}