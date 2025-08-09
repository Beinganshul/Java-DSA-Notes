import java.util.*;
public class Array {



    //?MAKE A FUNCTION TO INCRESE THE VALUE OF ARRAY BY 2.



    public static void update(int marks[]) {
        for(int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 2;
        }
    }




    //?MAKE A FUNCTION OF LINEAR SEARCH IN AN ARRAY.



    public static int linearSearch(int numbers[] , int key){
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == key){
            return i;
            }
        }
        return -1;
    }



    //?MAKE A FUNCTION TO FIND SMALLEST IN AN ARRAY.



    public static int getSmallest(int numbers[]){
        int Smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(Smallest>numbers[i]){
               Smallest = numbers[i];
            }
        }   
        return Smallest;
    }



    //?MAKE A FUNCTION TO FIND LARGEST IN AN ARRAY.



    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
               largest = numbers[i];
            }
        }   
        return largest;
    }



    //?PRINT PAIRS OF AN ARRAY.



    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + " , " + numbers[j] + ")");
            }
            System.out.println();
        }  
    }



    //?MAKE A FUNCTION OF BINARY SEARCH IN AN ARRAY.



    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(numbers[mid] == key){
                return mid;
            }else if(numbers[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }



    //?MAKE A FIUNCTION TO REVERSE AN ARRAY.



    public static void reverse(int numbers[]){
        int start = 0;
        int end = numbers.length-1;
        while(start<end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }



    //?MAKE A FUNCTION TO PRINT THE SUBARRAYS OF AN ARRAY.



    public static void printSubArrays(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
        }
    }



    //?MAKE A FUNCTION TO FIND THE INDEX OF A NUMBER IN AN ARRAY. AND IF THE NUMBER IS NOT FOUND THEN RETURN 
    //?THE INDEX WHERE IT SHOULD BE INSERTED.
     


    public static int binarySearch(int numbers[], int key){
    int start = 0;
    int end = numbers.length-1;
    while(start<=end){
        int mid = start + (end-start)/2;
        if(numbers[mid] == key){
            return mid;
        }else if(numbers[mid] < key){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
    }
    // If key not found, return the insertion point
    // At this point, 'start' is the position where the key should be inserted
    return start;
}



  









    public static void main(String args[]) {
        Scanner dc = new Scanner(System.in);
        


        //*ARRAY--ARRAY IS A LIST OF SAME TYPE OF ELEMENTS
                  //*IN A CONTIGUOUS MEMORY LOCATION.


        //*DECLARATION OF ARRAY
        

        // int marks [] = new int[5];
        // marks[0] = 10;             //* 0, 1, 2, 3, 4 are the index of the array. 
        // marks[1] = 20;
        // marks[2] = 30; 
        // marks[3] = 40;
        // marks[4] = 50;  
        // System.out.println("The marks are: " + marks[0]);


        //*ARRAY CAN BE DECLARED IN A SINGLE LINE ALSO


        // int marks1[] = {10, 20, 30, 40, 50};               //*MARKS 10 WILL BE ON INDEX 0
        // System.out.println("The marks are: " + marks1[0]);

        //*TAKING INPUT IN ARRAY.


        // int marks2[] = new int[5];     //*MORE EFFICIENT WAY OF TAKING INPUT IN AN ARRAY.
        // for(int i = 0; i < 5; i++) {
        //     System.out.println("Enter the marks");
        //     marks2[i] = dc.nextInt();


        //*PASSIG ARRAY AS A FUNCTION ARGUMENT.

        //*PASSING OF ARRAY AS A FUNCTION WORK BY CALL BY REFERENCE.
        //*MEANS WHEN WE DO SOME CHANGES IN THE ARRAY IN THE FUNCTION 
        //*IT WILL ALSO REFLECT IN THE MAIN FUNCTION.



        //?UPDATE MARKS OF AN ARRAY BY 2.



        // int marks[] = {10 , 20 , 30 , 40 , 50};
        // update(marks);
        // for(int i = 0; i < marks.length; i++){
        //     System.out.println(marks[i]);
        // }
        


        //?LINEAR SEARCH IN AN ARRAY.



        // int numbers[] = {10,20,30,40,50};
        // System.out.println("Enter the number you want to search");
        // int key = dc.nextInt();
        // int index = linearSearch(numbers, key);
        // if(index == -1){
        //     System.out.println("Element not found");
        // }else{
        //     System.out.println("Element found at index " + index);
        //     }



        //?FIND THE LARGEST IN AN ARRAY.



        // int numbers[] = {10,20,30,40,50};
        // int largest = getLargest(numbers);
        // System.out.println("The largest number is: " + largest);



        //?FIND THE SMALLEST IN AN ARRAY.



        // int numbers[] = {10,20,30,40,50};
        // int Smallest = getSmallest(numbers);
        // System.out.println("The Smallest number is: " + Smallest);



        //?PAIRS IN AN ARRAY.



        // int numbers[] = {10,20,30,40,50};
        // printPairs(numbers);



        //?BINARY SEARCH IN AN ARRAY.



        // int numbers[] = {10,20,30,40,50};
        // System.out.println("Enter the number you want to search");
        // int key = dc.nextInt();
        // int index = binarySearch(numbers, key);
        // if(index == -1){
        //     System.out.println("Element not found");
        // }else{
        // System.out.println("Element found at index " + index);
        // }   



        //?REVERSE AN ARRAY.



        // int numbers[] = {10,20,30,40,50};
        // reverse(numbers);
        // for(int i = 0; i < numbers.length; i++){
        //     System.out.print(numbers[i]);
        // }


        //?PRINT SUBARRAYS OF AN ARRAY.



        // int numbers[] = {10,20,30,40,50};
        // printSubArrays(numbers);


        //?FIND HOW MANY TIMES A NUMBER IS REPEATED IN AN ARRAY


        // int numbers[] = {10,20,30,40,50,10,20,30,40,50};
        // int count = 0;
        // System.out.println("Enter the number you want to search");
        // int key = dc.nextInt(); 
        // for(int i = 0; i < numbers.length; i++){
        //     if(numbers[i] == key){
        //         count++;
        //     }
        // }
        // System.out.println("The number is repeated " + count + " times");



        //?MAKE A FUNCTION TO FIND THE INDEX OF A NUMBER IN AN ARRAY. AND IF THE NUMBER IS NOT FOUND THEN RETURN 
        //?THE INDEX WHERE IT SHOULD BE INSERTED.


        int numbers[] = {10,20,30,40,50};
        System.out.println("Enter the number you want to search");
        int key = dc.nextInt();
        int index = binarySearch(numbers, key);
        if(index < numbers.length && numbers[index] == key){
            System.out.println("Element found at index " + index);
        }else{
            System.out.println("Element not found. It should be inserted at index " + index);
        }



        //*return new int[]{i, j};   returning an array without declaring its size
        
        







        
    }
}