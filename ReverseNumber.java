import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        int ans=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num=sc.nextInt();
        sc.close();
        while(num>0){
            ans=ans*10+(num%10);
            num/=10;

        }
        System.out.println("Reverse num      :"+ans);       
    }
}
