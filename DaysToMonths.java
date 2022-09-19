import java.util.Scanner;

public class DaysToMonths {
    public static void main(String[] args) {
        int days,month,remain;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Days :");
        days=sc.nextInt();
        sc.close();
        month=days/30;
        remain=days%30;
        System.out.println("=======================> :"+month+" Months - "+remain+" Days");



    }
    
}
