import java.util.Scanner;
public class FindProfit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the selling price :");
        int sellingPrice=sc.nextInt();
        System.out.print("Enter the cost    price :");
        int costPrice=sc.nextInt();
        sc.close();
        System.out.println("Profit is               :"+(sellingPrice-costPrice));

    }
    
}
