import java.util.Scanner;
public class patt2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        for(int r=1;r<2*n;r++){
            int col=r>n?2*n-r:r;
            for(int c=0;c<col;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
