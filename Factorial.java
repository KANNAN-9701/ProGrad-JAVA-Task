import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter a Number :");
        int num=sc.nextInt();
        sc.close();
        int ans=1;
        for(int i=1;i<=num;i++){
            ans*=i;
        }
        System.out.println("Factorial of "+num+" is "+ans);
    }
}
