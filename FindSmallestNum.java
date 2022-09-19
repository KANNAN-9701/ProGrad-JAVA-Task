import java.util.Scanner;
public class FindSmallestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number  :");
        int firstNum=sc.nextInt();
        System.out.print("Enter the Second Number :");
        int secondNum=sc.nextInt();
        sc.close();
        System.out.println("Smallest Number is      :"+((firstNum<secondNum)?firstNum:secondNum));
    }
    
}
