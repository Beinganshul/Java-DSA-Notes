import java.util.*;
public class Pattern {
    public static void main(String args[]){
        Scanner dc = new Scanner(System.in);
        
        //*PATTERN
        //*NESTED LOOPS --- LOOPS INDSIDE LOOP ARE KNOWNS NESTED LOOPS 
        //*USED WHEN WE WANT TO REPEAT SEVERAL THINGS INSIDE SOMETHING IN A LOOP


        //?PRINT A STAR PATTERN.


        for(int line = 1; line<=10; line++){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println("");     //*WHENEVER WE WANT TO USE NEXT LINE IN SOME SPECIAL CASES 
        }                               //*LIKE THIS WE CAN SIMPLY DO THIS.



        //?PRINT AN INVERTED STAR PATTERN



        //*TUKKE ME HO GYA BUT SAMAJH NAHI AAYA KI KAISE HUA.


        // for(int line = 1; line<=10; line++){
        //     for(int star = 10; star>=line; star--){
        //         System.out.print("*");
        //     }
        //     System.out.println("");     
        // }                               


        //*BY SHRADHA DIDI.

        // int n = 10;
        // for(int line = 1; line<=n; line++){
        //     for(int star = 1; star<=n-line+1; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");      //* n-line+1 SE EK PATTERN BANEGA
        // }                            

        

        //?PRINT A HALFED PYRAMID PATTERN.


        
        // for(int line = 1; line<=10; line++){
        //     for(int i = 1; i<=line; i++){
        //         System.out.print(i);
        //     }
        //     System.out.println("");     
        // }                               


        
        //?PRINT CHARACTER PATTERN.


        // int n =4;
        // char ch = 'A';
        // for(int line = 1; line<=n; line++){
        //     for(int chars = 1; chars<=line; chars++){
        //     System.out.print(ch);
        //     ch++;
        //     }
        //     System.out.println();   
        // }    
 
        //*NEXT LINE ME KARNE KE LIYE ANDAR WALE LOOP ME PRINT KARAO AND
        //*ANDAR WALE LOP KE BAHIR WHICH IS BAHIR WALA LOOP OOSME NEXT LINE DO 
        //*BEACAUSE LINE SE KHEL KARNE KA KAAM BAHIR WALE LOOP KA HAI,
        //*ANDAR WALA TO SIRF LINES ME KYA PRINT KARANA HAI OOS KAAM AATA HAI.



        












































































































        

    }
} 