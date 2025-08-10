import java.util.*;
public class ArrayPart2 {


    //?MAKE A FUNCTION TO FIND MAXIMUM SUBARRAY SUM.

    //?BY BRUTE FORCE METHOD.


    public static void maximumSubarraySum(int numbers[]){
        // int curr = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                int curr = 0;
                for(int k=i; k<=j; k++){
                    curr = curr + numbers[k];
                }
                System.out.println(curr);
                if(maxSum<curr){
                   maxSum = curr;
                }
            } 
        }
        System.out.println("Maximum sum is - " + maxSum);
    }


    //?BY PREFIX SUM METHOD.


   public static void maximumSubarraySum2(int numbers[]){
    int maxSum = Integer.MIN_VALUE;

    //*FORMING PREFIX ARRAY

    int prefix[] = new int[numbers.length];
    prefix[0] = numbers[0];

    for(int i=1; i<numbers.length; i++){
        prefix[i] = prefix[i-1] + numbers[i];
    }

    //*CALCULATING MAXIMUM SUM.

    for(int i=0; i<numbers.length; i++){
        for(int j=i; j<numbers.length; j++){
            int curr = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
            if(maxSum < curr){
                maxSum = curr;
            }
        }
    }
    System.out.println("Maximum sum is - " + maxSum);
   }


   //?BY KADENES ALGORITHM.


   public static void kadenes(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i=0; i<numbers.length; i++){
        cs += numbers[i];
        if(cs<0){
            cs = 0;
        }
        ms = Math.max(ms, cs);
    }
    System.out.println("Maximum sum is - " + cs);
   }



   //?FUNCTION FOR MAXIMUM SUBARRAY SUM FOR NEGATIVE NIMBERS ALSO

   
   public static void kadenesBest(int numbers[]){
    int maxSum = numbers[0];
    int currentSum = numbers[0];
    for(int i=1; i<numbers.length; i++){
        currentSum = Math.max(numbers[i], currentSum + numbers[i]);
        maxSum = Math.max(maxSum, currentSum);
    }
    System.out.println("Maximum sum is - " + maxSum);
   }



   //?TRAPPING RAIN WATER WITH WIDTH 1.


   public static int trappingRainWater(int height[]){
    int n = height.length;

    //*LEFT MAXIMUM.

    int lm[] = new int[n];
    lm[0] = height[0];
    for(int i=1; i<n; i++){
        lm[i] = Math.max(height[i] , lm[i-1]);
    }
                                           //*HAR EK BAR KE LIYE ALAG ALAG CALCULATE KIYA HAI.
    //*RIGHT MAXIMUM.                      //*LEFT MAX AND RIGHT MAX KOE EK SATH CALCULATE KIYA HAI.              
                                           //*TIME COMPLEXITY BADH JAYEGI AGAR EK SATH CALCULATE KIYA HOTA.
    int rm[] = new int[n];
    rm[n-1] = height[n-1];
    for(int i=n-2; i>=0; i--){
        rm[i] = Math.max(height[i] , rm[i+1]);
    }

    //*WATER TRAPPED.

    int trappedWater = 0;
    for(int i=0; i<n; i++){
        trappedWater += Math.min(lm[i], rm[i]) - height[i];
    }
    return trappedWater;
   }


   //?BUY AND SELL SOTCKS.


   public static int buyAndSellStocks(int prices[]){
    int n = prices.length;
    int maxProfit = 0;          
    int buyPrice = prices[0];
    for(int i=1; i<n; i++){
        if(buyPrice < prices[i]){
            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit,profit);
        }else{
            buyPrice = prices[i];
        }
    }
    return maxProfit;
   }


   //?MAKE A FUNCTION TO FIND HOW MANY TIMES A NUMBER IS REPEATED IN AN ARRAY.


    public static void findFrequency(int numbers[]){
        int n = numbers.length;
        for(int i=0; i<n; i++){
            if(numbers[i] != -1){
                int count = 1;
                for(int j=i+1; j<n; j++){
                    if(numbers[i] == numbers[j]){
                        count++;
                        numbers[j] = -1;
                    }
                }
                System.out.println(numbers[i] + " is repeated " + count + " times.");
            }
        }
    }


    // //?MAKE A FUNCTION TO FIND HOW MANY TIMES A NUMBER IS REPEATED IN AN ARRAY USING HASHMAP.


    // public static void findFrequency2(int numbers[]){
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for(int i=0; i<numbers.length; i++){
    //         if(map.containsKey(numbers[i])){
    //             map.put(numbers[i], map.get(numbers[i]) + 1);
    //         }else{
    //             map.put(numbers[i], 1);
    //         }
    //     }
    //     for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    //         System.out.println(entry.getKey() + " is repeated " + entry.getValue() + " times.");
    //     }
    // }


    
    //?MAKE A FUNCTION WHICH COUNTS THE APPEARANCE OF AN ELEMENT IF REPEATED


     public static boolean appearance(int numbers[]){
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length-1; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
     }





    public static void main(String args[]){
        Scanner dc = new Scanner(System.in);


        //?MAXIMUM SUBARRAY SUM.


        //?BY BRUTE FORCE METHOD.


        // System.out.println("Enter the size of the array");
        // int n = dc.nextInt();
        // int numbers[] = new int[n];
        // for(int i=0; i<numbers.length; i++){
        //     System.out.println("Enter the number");
        //     numbers[i] = dc.nextInt();
        // }
        // maximumSubarraySum(numbers); 


        //?BY PREFIX SUM METHOD.


        // System.out.println("Enter the size of the array");
        // int n = dc.nextInt();
        // int numbers[] = new int[n];
        // for(int i=0; i<numbers.length; i++){
        //     System.out.println("Enter the number");
        //     numbers[i] = dc.nextInt();
        // }
        // maximumSubarraySum2(numbers);


        //?BY KADENES ALGORITHM.


        // System.out.println("Enter the size of the array");
        // int n = dc.nextInt();
        // int numbers[] = new int[n];
        // for(int i=0; i<numbers.length; i++){
        //     System.out.println("Enter the number");
        //     numbers[i] = dc.nextInt();
        // }
        // kadenes(numbers);


        //?TRAPPING RAIN WATER WITH WIDTH 1.


        // System.out.println("Enter the size of the array");
        // int n = dc.nextInt();
        // int height[] = new int[n];
        // for(int i=0; i<height.length; i++){
        //     System.out.println("Enter the number");
        //     height[i] = dc.nextInt();
        // }
        // int Trapped_Water = trappingRainWater(height);
        // System.out.println("Trapped Water is = " + Trapped_Water);


        //?BUY AND SELL STOCKS.


        // System.out.println("Enter the size of the array");
        // int n = dc.nextInt();
        // int prices[] = new int[n];
        // for(int i=0; i<prices.length; i++){
        //     System.out.println("Enter the number");
        //     prices[i] = dc.nextInt();
        // }
        // int maxProfit = buyAndSellStocks(prices);
        // System.out.println("Maximum Profit is = " + maxProfit);


        //?FIND HOW MANY TIMES A NUMBER IS REPEATEDIN AN ARRAY.


        // System.out.println("Enter the size of the array");
        // int n = dc.nextInt();
        // int numbers[] = new int[n];
        // for(int i=0; i<numbers.length; i++){
        //     System.out.println("Enter the number");
        //     numbers[i] = dc.nextInt();
        // }
        // findFrequency(numbers);


        //?FIND HOW MANY TIMES A NUMBER IS REPEATED IN AN ARRAY USING HASHMAP.


        // System.out.println("Enter the size of the array");
        // int n = dc.nextInt();
        // int numbers[] = new int[n];
        // for(int i=0; i<numbers.length; i++){
        //     System.out.println("Enter the number");
        //     numbers[i] = dc.nextInt();
        // }
        // findFrequency2(numbers);



        //?KADANES ALGO BETTER VERSION



        // System.out.println("Enter the size of the array");
        // int n = dc.nextInt();
        // int numbers[] = new int[n];
        // for(int i=0; i<numbers.length; i++){
        //     System.out.println("Enter the number");
        //     numbers[i] = dc.nextInt();
        // }
        // kadenesBest(numbers);



        //?CODE FOR APPEARANCE IN AN ARRAY


        
        // System.out.println("Enter the size of the array");
        // int n = dc.nextInt();
        // int numbers[] = new int[n];
        // for(int i=0; i<numbers.length; i++){
        //     System.out.println("Enter the number");
        //     numbers[i] = dc.nextInt();
        // }
        // boolean result = appearance(numbers);
        // System.out.println(result);







        




    }

    
}