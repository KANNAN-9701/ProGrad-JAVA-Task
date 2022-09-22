import java.util.Scanner;
public class SumofDigit {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number         :");
        num=sc.nextInt();
        sc.close();
        while(num>0){
            sum+=(num%10);
            num/=10;
        }
        System.out.println("The sum of the digits is :"+sum);





        

        
    }
    
}
