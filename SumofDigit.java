import java.util.Scanner;
public class SumofDigit {
    public static void main(String[] args) {
        int num,sum,rem1,rem2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number         :");
        num=sc.nextInt();
        sc.close();
        rem1=num%10;
        num=num/10;
        rem2=num%10;
        num=num/10;
        sum=rem1+rem2+num;
        System.out.println("The sum of the digits is :"+sum);





        

        
    }
    
}
