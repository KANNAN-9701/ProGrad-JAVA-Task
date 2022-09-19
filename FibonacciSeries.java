import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter a Number of terms :");
        int num=sc.nextInt();
        sc.close();
        int a=0,b=1,c;
        for(int i=1;i<=num;i++){
            c=a+b;
            System.out.print(a+" ");
            a=b;
            b=c;
        }
         
    }
}
