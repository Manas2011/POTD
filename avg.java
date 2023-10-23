import java.util.*;
public class avg{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        double average;
        System.out.println("Enter first number:");
        a=sc.nextInt();
         System.out.println("Enter second number:");
        b=sc.nextInt();
         System.out.println("Enter third number:");
        c=sc.nextInt();
        average=(a+b+c)/3;
        System.out.println("Average value is:"+average);

    }
}