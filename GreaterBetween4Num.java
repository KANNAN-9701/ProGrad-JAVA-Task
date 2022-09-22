import java.util.Scanner;

public class GreaterBetween4Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Num  :");
        int n1=sc.nextInt();
        System.out.print("Enter the Second Num :");
        int n2=sc.nextInt();
        System.out.print("Enter the Third Num  :");
        int n3=sc.nextInt();
        System.out.print("Enter the Fourth Num :");
        int n4=sc.nextInt();
        sc.close();
        int ans=(n1>n2 && n1>n3 && n1>n4)?n1:(n2>n3 && n2>n4)?n2:(n3>n4)?n3:n4;
        System.out.println("Largerst Number is   :"+ans);
    }
}
