// public class JavaBasics {
//    public static void main(String args[]) {
//        System.out.print("Hello World\nHello World\nHello World\n");
//    }
// }   

//* Here we have the summmary 
//* \n is used to create next line.
//* println is also used to make the next line.
//* Variables are the memory locations used to store values

import java.util.*;
public class JavaBasics {
    public static void main(String args[]){
      Scanner dc = new Scanner(System.in);   
         
         
        /*int a = 2;
          int b = 3;
          String Name = "Tony Stark";   //*Always use double quotes on name or strings.
          System.out.print("a\n");      //*If we use double quotes in printing variables it will print the letter.
          System.out.println(a);        //*To print the value of variable write only variable.
          System.out.println(b);
          a = 5;                        //*We can further change the value of variable in our program.
          System.out.println(a);
          a = b;                        //*We can also assign the value of diffrent variable in another variable.
          System.out.println(a);*/
          

        /*byte a = 2;          //*1 byte
          char ch = 'a';       //*2 byte //character always in single quotes.
          boolean var = true;  //*1 byte //it starts from small letter.
          float price = 10.34; //*4 byte           
          int number = 5;      //*4 byte
          short c = 240;*/     //*2 byte
          
        //*long used for big integers.          //8 byte
        //*double used for big decimal numbers. //8 byte
        //*1 byte = 8 bits

        
        //   int a = 2;
        //   int b = 3;
        //   int sum = a+b;
        //   System.out.println(a+b);
        //   System.out.println(sum);
        
        
        // String input = dc.next();           //only take input without space.
        // System.out.println(input);
        // String name = dc.nextLine();
        // System.out.println(name);

        /*next                                //string
          nextLine                            //After next first letter always capital.
          nextInt
          nextFloat
          nextLong 
          nextByte
          nextBoolean
          nextDouble
          nextShort*/



        //**Sum of two numbers.



        // int a = dc.nextInt();
        // int b = dc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);




        //*Product of two numbers.



        // int a = dc.nextInt();
        // int b = dc.nextInt();
        // int product = a * b;
        // System.out.println(product);
        
        
        //*Whenever we use decimal value without declring it as float java take it as double.
        //*If we still want to use it like wise write 'f' right after it.
        //*do it always.


        // float rad = dc.nextFloat();
        // float area = 3.14f * rad * rad;
        // System.out.println(area);

        
        //* Type conversion - we can assign small datatypes value in large datatypes


        // float number = dc.nextInt();
        // System.out.println(number);


        //*Type casting - jabardasti lossy conversion karana.


        // float a = 23.98f;
        // int b = (int)a;
        // System.out.println(b);
        

        // int a = dc.nextInt();
        // int b = dc.nextInt();
        // // System.out.println("answer is = " + (a+b));
        // int sum = a+b;
        // System.out.println("answer is = " + (sum));

        
        // int a = 10;
        // int b = ++a;
        // System.out.println(a);
        // System.out.println(b);


        // int a = 10;
        // int b = a++;           //*pehele b create hoga with a ki purani value then a print hoga with plus one
        // System.out.println(a);
        // System.out.println(b);


        // int a = 10;
        // int b = 10;
        // System.out.println(a==b);


        // int a = 10;
        // int b = 10;
        // System.out.println(a!=b);


        // System.out.println(3>2 && 2>1);
        // System.out.println(3<2 && 2>1);
        // System.out.println(3>2 && 2<1);
        // System.out.println(3<2 && 2<1);




        // System.out.println(3>2 || 2>1);
        // System.out.println(3<2 || 2>1);
        // System.out.println(3>2 || 2<1);
        // System.out.println(3<2 || 2<1);


        // System.out.println(!(3>2 || 2>1));



        
    }   
}