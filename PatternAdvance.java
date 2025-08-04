import java.util.*;
public class PatternAdvance{



    //?MAKE A FUNCTION TO PRINT A HOLLOW RECTANGLE.



    public static void hollowRectangle(int rows, int cols){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    


    //?MAKE A FUNCTION TO PRINT AN INVERTED AN ROTATED HALF PYRAMID.



    public static void inverted_and_roated_half_pyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println(); 
        }
    }



    //?MAKE A FUNCTION TO PRINT AN INVERTED HALF PYRAMID BY NUMBERS.



    public static void  invertedHalfPyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }



    //?MAKE A FUNCTION TO PRINT A FLOYD'S TRIANGLE.



    public static void floyds_triangle(int rows){
        int count = 1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }



    //?MAKE A FUNCTION TO PRINT A 0-1 TRIANGLE PATTERN.



    public static void zero_one_triangle(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }



    //?MAKE A FUNCTION THAT PRINTS BUTTERFLY PATTERN.



    public static void butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
                        
    }



    //?MAKE A FUNCTION THAT PRINTS A SOLID RHOMBUS PATTERN.



    public static void solidRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    



    //?MAKE A FUNCTION THAT PRINTS A DIAMOND PATTERN.



    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
                }
                for(int j=1; j<=2*i-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=n; i>=1; i--){
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                    }
                    for(int j=1; j<=2*i-1; j++){
                        System.out.print("*");
                        }
                        System.out.println();
                    }
    }



    //?MAKE A FUNCTION THAT PRINTS A HOLLOW RHOMBUS PATTERN.



    public static void hollowRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

        





    public static void main(String args[]){
        Scanner dc = new Scanner(System.in);
        


        //?PRINT A HOLLOW RECTANGLE.



        // System.out.println("Enter number of rows");
        // int rows = dc.nextInt();
        // System.out.println("Enter number of columns");
        // int cols = dc.nextInt();
        // hollow_Rectangle(rows, cols);



        //?PRINT AN INVERTED AND ROTATED HALF PYRAMID.



        // System.out.println("Enter number of rows");
        // int rows = dc.nextInt();
        // inverted_and_roated_half_pyramid(rows);



        //?PRINT AN INVERTED HALF PYRAMID BY NUMBERS.



        // System.out.println("Enter number of rows");
        // int rows = dc.nextInt();
        // inverted_half_pyramid(rows);



        //?PRINT FLOYD'S TRIANGLE.



        // System.out.println("Enter numbers of rows");
        // int rows = dc.nextInt();
        // floyds_triangle(rows);



        //?PRINT A 0-1 TRIANGLE PATTERN.



        // System.out.println("Enter number of rows");
        // int rows = dc.nextInt();
        // zero_one_triangle(rows);



        //?PRINT A BUTTERFLY PATTERN.



        // System.out.println("Enter number of rows");
        // int n = dc.nextInt();
        // butterfly(n);



        //?PRINT A SOLID RHOMBUS PATTERN.



        // System.out.println("Enter number of rows");
        // int n = dc.nextInt();
        // solidRhombus(n);



        //?PRINT A DIAMOND PATTERN.



        // System.out.println("Enter number of rows");
        // int n = dc.nextInt();
        // diamond(n);



        //?PRINT A HOLLOW RHOMBUS PATTERN.



        // System.out.println("Enter number of rows");
        // int n = dc.nextInt();
        // hollowRhombus(n);

        


        System.out.println("What would you like to print:");
        System.out.println("1. Hollow Rectangle");
        System.out.println("2. Inverted and Rotated Half Pyramid");
        System.out.println("3. Inverted Half Pyramid by Numbers");
        System.out.println("4. Floyd's Triangle");
        System.out.println("5. 0-1 Triangle Pattern");
        System.out.println("6. Butterfly Pattern");
        System.out.println("7. Solid Rhombus Pattern");
        System.out.println("8. Diamond Pattern");
        System.out.println("9. Hollow Rhombus Pattern");
        System.out.println("Enter your choice (1-9):");

        int choice = dc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter number of rows");
                int rows = dc.nextInt();
                System.out.println("Enter number of columns");
                int cols = dc.nextInt();
                hollowRectangle(rows, cols);
                break;
            case 2:
                System.out.println("Enter number of rows");
                rows = dc.nextInt();
                inverted_and_roated_half_pyramid(rows);
                break;
            case 3:
                System.out.println("Enter number of rows");
                rows = dc.nextInt();
                invertedHalfPyramid(rows);
                break;
            case 4:
                System.out.println("Enter number of rows");
                rows = dc.nextInt();
                floyds_triangle(rows);
                break;
            case 5:
                System.out.println("Enter number of rows");
                rows = dc.nextInt();
                zero_one_triangle(rows);
                break;
            case 6:
                System.out.println("Enter number of rows");
                int n = dc.nextInt();
                butterfly(n);
                break;
            case 7:
                System.out.println("Enter number of rows");
                n = dc.nextInt();
                solidRhombus(n);
                break;
            case 8:
                System.out.println("Enter number of rows");
                n = dc.nextInt();
                diamond(n);
                break;
            case 9:
                System.out.println("Enter number of rows");
                n = dc.nextInt();
                hollowRhombus(n);
                break;
            default:
                System.out.println("maa mat chuda");
                break;
        }
    




        





        

       

    }
}
