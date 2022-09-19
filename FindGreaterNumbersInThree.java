import java.util.Scanner;
public class FindGreaterNumbersInThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number  :");
        int firstNum=sc.nextInt();
        System.out.print("Enter the Second Number :");
        int secondNum=sc.nextInt();
        System.out.print("Enter the Third Number  :");
        int thirdNum=sc.nextInt();
        sc.close();
        int res=(firstNum>secondNum)?(firstNum>thirdNum?firstNum:thirdNum):(secondNum>thirdNum?secondNum:thirdNum);
        System.out.println("Greater Number is       :"+res);
    }
    
}
