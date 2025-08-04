import java.util.*;
public class TwoDArray {


    //?MAKE A FUNCTION TO PRINT SPIRAL MATRIX.


    public static void PrintSpiral(int matrix[][]){
        int sr = 0;
        int er = matrix.length-1;
        int sc= 0;
        int ec = matrix[0].length - 1;
        while(sr<=er && sc<=ec){
            for(int j=sc; j<=ec; j++){
                System.out.print(matrix[sr][j] + " ");
            }
            for(int i=sr+1; i<=er; i++){
                System.out.print(matrix[i][ec] + " ");
            }
            for(int j=ec-1; j>=sc; j--){
                if(sr==er){
                    break;
                }
                System.out.print(matrix[er][j] + " ");
            }
            for(int i=er-1; i>=sr+1; i--){
                if(sc==ec){
                    break;
                }
                System.out.print(matrix[i][sc] + " ");
            }
            sr++;
            sc++;
            er--;
            ec--;
            
        }
    }


    


    //?MAKE A FUNCTION TO PRINT THE DIAGONAL SUM.


    public static int DiagonalSum(int matrix[][]){
        int sum = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){ 
            for(int j=0; j<m; j++){
                if(i==j){
                     sum += matrix[i][j];
                }
                else if(i+j == n-1){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }


    //?SUM OF DIAGONAL OF A MATRIX IN MORE OPTIMIZED WAY.


    public static int OptimizedDiagonalSum(int matrix[][]){
        int sum = 0;
        int n = matrix.length;
        for(int i=0; i<n; i++){
            sum += matrix[i][i];
            if(i != n-1-i){
               sum += matrix[i][n-1-i];
            }
        }
        return sum;
    }


    //?SEARCH IN SORTED MATRIX.


    //?STAIR CASE SEEARCH.


    public static boolean stairCaseSearch(int matrix[][] , int key){
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m-1;
        while(i<n && j>=0){
            if(matrix[i][j] == key){
                System.out.println("Key found at index - " + "(" + i + "," + j + ")");
                return true;
            }else if(key < matrix[i][j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Key not found");
        return false;
    }


    //?PRINT HOW MANY KEYS ARE THERE IN 2D-ARRAY.


    public static int HowManyKeys(int matrix[][] , int key){
        int n = matrix.length;
        int m = matrix[0].length;
        int numberOfkeys = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==key){
                   numberOfkeys+=1;
                   continue;
                }
            }
        }
        return numberOfkeys;
    }


    public static int sumOfrow(int matrix[][], int row){
        int n = matrix.length;
        int m = matrix[0].length;
        int sumOfRow = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){ 
                if(i==row-1){
                   sumOfRow += matrix[i][j];
                }
            }
        }
        return sumOfRow;
    }






    public static void main(String args[]){
        Scanner dc = new Scanner(System.in);
        

        //?CREATING A 2D-ARRAY.

        // System.out.println("Enter number of rows");
        // int n = dc.nextInt();
        // System.out.println("Enter number of columns");
        // int m = dc.nextInt();
        // int matrix[][] = new int[n][m];
        // // int n = matrix.length , m = matrix[0].length;   //*ROW OR COLOUMN KI LENGTH NIKALNE KE LIYE.
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.println("Enter the elements");
        //         matrix[i][j] = dc.nextInt();
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        //?PRINT SPIRAL MATRIX. 


        // int matrix[][] = {{1 , 2 , 3 , 4},
        //                   {5 , 6 , 7 , 8},
        //                   {9 , 10 , 11 , 12},
        //                   {13 , 14 , 15 , 16}};
        // // PrintSpiral(matrix);
        // int sum = DiagonalSum(matrix);
        // System.out.println("Sum of diagonal matrix is - " + sum);

       

        //?PRINT SUM OF DIAGONAL MATRIX.


        // System.out.println("Enter number of rows");
        // int n = dc.nextInt();
        // System.out.println("Enter number of coloumn");
        // int m = dc.nextInt();
        // int matrix[][] = new int[n][m];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.println("Enter tne elements");
        //         matrix[i][j] = dc.nextInt();
        //     }
        // }
        // int sum = DiagonalSum(matrix);
        // System.out.println("Sum of diagonal matrix is - " + sum);


        //?PRINT SUM OF DIAGONAL OF MATRIX IN AN OPTIMIZED WAY.


        // System.out.println("Enter number of rows");
        // int n = dc.nextInt();
        // System.out.println("Enter number of coloumn");
        // int m = dc.nextInt();
        // int matrix[][] = new int[n][m];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.println("Enter tne elements");
        //         matrix[i][j] = dc.nextInt();
        //     }
        // }
        // int sum = OptimizedDiagonalSum(matrix);
        // System.out.println("Sum of diagonal matrix is - " + sum);


        //?SEARCH IN SORTED MATRIX.

        //?BY STAIRCASE SEARCH.


        // System.out.println("Enter number of rows");
        // int n = dc.nextInt();
        // System.out.println("Enter number of coloumn");
        // int m = dc.nextInt();
        // int matrix[][] = new int[n][m];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.println("Enter tne elements");
        //         matrix[i][j] = dc.nextInt();
        //     }
        // }
        // System.out.println("Enter the element you would like to search");
        // int key = dc.nextInt();
        // stairCaseSearch(matrix, key);


        //?PRINT NUMBER OF KEYS IN AN 2D-ARRAY.



        // System.out.println("Enter number of rows");
        // int n = dc.nextInt();
        // System.out.println("Enter number of coloumn");
        // int m = dc.nextInt();
        // int matrix[][] = new int[n][m];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.println("Enter tne elements");
        //         matrix[i][j] = dc.nextInt();
        //     }
        // }
        // System.out.println("Enter the element you would like to find how many times it is repeated");
        // int key = dc.nextInt();
        // int number=HowManyKeys(matrix, key); 
        // System.out.println(key + " is repeated " + number + " times");


        //?PRINT THE SUM OF NTH ROW.



        // System.out.println("Enter number of rows");
        // int n = dc.nextInt();
        // System.out.println("Enter number of coloumn");
        // int m = dc.nextInt();
        // int matrix[][] = new int[n][m];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.println("Enter tne elements");
        //         matrix[i][j] = dc.nextInt();
        //     }
        // }
        // System.out.println("Enter the row you would like to calculate the sum of");
        // int row = dc.nextInt();
        // int sum = sumOfrow(matrix, row); 
        // System.out.println("Sum of the row is " + sum);



       










    }

}