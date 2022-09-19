import java.util.*;
public class SwapTwoNum {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number  :");
        a=sc.nextInt();
        System.out.print("Enter the Second Number :");
        b=sc.nextInt();
        sc.close();
        System.out.println("Before Swapping two Numbers :First Num :"+a+": Second Num :"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping Two Numbers  :First Num :"+a+": Second Num :"+b);

    }
    
}
