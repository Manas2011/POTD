/*you are tasked with creating a program that converts a given decimal number to its binary representation.
 * the binary representation of a decimal number is a sequence of 0s and 1s ,representing the same value as base 2
 * Input :The program should accept single integer input,decimal_input,which is the decimal number to be converted .
 * This input should be obtained the user through standard input(e.g. using the input() function in Python).
 * Output: The program should produce a string ,binary_output,which represents the binary equivalent of the input decimal number.
 * This string should consist of 0s and 1s and should be displayed to the user as the result.
 */
import java.util.*;
import java.math.*;
public class convbin {
    static int bin(int n ,int arr[],int i){
            if(n==0){
                return 0;
            }
            int r;
            r=n%2;
            arr[i++]=r;
            return bin(n/2,arr,i);

        }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int n ,i=0;
        int arr[]=new int[50];
        System.out.println("Enter number:");
        n=sc.nextInt();
        bin( n,arr,i);
        for(int j=49;j>=0;j--){
            System.out.print(arr[j]);
        }

    }
    
}
