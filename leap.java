import java.util.*;
public class leap {
    static boolean checkLeap(int year){
        if (year>0){
            if((year%400==0)||(year % 100!=0)&&(year%4==0)){
                return true;
            }
        }
        return false;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner (System.in);
        int y;
        System.out.println("Enter year");
        y=sc.nextInt();
        System.out.println(checkLeap(y));


    }
    
}
 