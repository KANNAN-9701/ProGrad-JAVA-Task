import java.util.Scanner;
public class SumofEvenNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter a Number :");
        int num=sc.nextInt();
        sc.close();
        int ans=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                ans+=i;
            }
        }
        System.out.println("Sum of Even Number is "+ans);
    }
}
