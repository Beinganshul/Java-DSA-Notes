import java.util.*;

public class BasicSortingAlgorithm {


    //?BUBBLE SORTING ALGORITHM.


    public static void bubbleSorting(int array[]){
        int n = array.length;
        for(int turn=0; turn<n-1; turn++){
            for(int j=0; j<n-turn-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    //*MAKING A FUNCTION TO PRINT THE ARRAY OF ALL SORTING ALGORITHMS.

    public static void printArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    //?SELECTION SORTING ALGORITHM.


    public static void selectionSorting(int array[]){
        for(int i=0; i<array.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[minIndex]){   
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

    }


    //?INSERTION SORTING ALGORITHM.


    public static void insertionSorting(int array[]){
        // for (int i=1; i<array.length ; i++){
        //     int curr = array[i];
        //     int preev = i-1;
        //     while(preev>=0 && array[preev]>curr){
        //         array[preev+1] = array[preev];
        //         preev--;
        //     }
        //     array[preev+1] = curr;
        // }

        //*DIFFERENT APPROACH FOR INSERTION SORTING.

        for(int i = 1; i <= array.length-1; i++){
            int j = i;
            while(j>0 && array[j]<array[j-1]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
    }


    //?COUNTING SORT ALGORITHM.


    public static void countingSort(int array[]){

        //*FINDING THE LARGEST ELEMENT IN THE ARRAY.

        int largest = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            largest = Math.max(largest, array[i]);
        }

        //*CREATING A COUNT ARRAY.

        int count[] = new int[largest+1];       //*KYUKI 0 SE START HOTA HAI ISILIYE LARGEST + 1 LIYA HAI
        for(int i=0; i<array.length; i++){
            count[array[i]]++;
        }

        //*MODIFYING THE COUNT ARRAY. MAIN SORTING LOGIC.

        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static long powerIterative(long base, long exp, long mod) {
    long result = 1;
    base = base % mod;

    while (exp > 0) {
        if ((exp & 1) == 1) {
            result = (result * base) % mod;
        }
        base = (base * base) % mod;
        exp >>= 1; // same as exp = exp / 2
    }

    return result;
}






    


    
    


    public static void main(String args[]){
        Scanner dc = new Scanner(System.in);


        //?SORT AN ARRAY BY BUBBLE SORTING ALGORITHM.


        // System.out.println("Enter the size of the array");
        // int n = dc.nextInt();
        // int array[] = new int[n];
        // for(int i=0; i<array.length; i++){
        //     System.out.println("Enter the number");
        //     array[i] = dc.nextInt();
        // }
        // bubbleSorting(array);
        // printArray(array);


        //?SORT AN ARRAY BY SELECTION SORTING.


    
        // System.out.println("Enter the size of the array");
        // int n = dc.nextInt();
        // int array[] = new int[n];
        // for(int i=0; i<array.length; i++){
        //     System.out.println("Enter the number");
        //     array[i] = dc.nextInt();
        // }
        // selectionSorting(array);
        // printArray(array);


        //?SORT AN ARRAY BY INSERETION SORTING.


        // System.out.println("Enter the size of the array");
        // int n = dc.nextInt();
        // int array[] = new int[n];
        // for(int i=0; i<array.length; i++){
        //     System.out.println("Enter the number");
        //     array[i] = dc.nextInt();
        // }
        // insertionSorting(array);
        // printArray(array);
 

        // long a=powerIterative(2, 2, 1000000007);
        // System.out.println("Power is: " + a);



    }
}



