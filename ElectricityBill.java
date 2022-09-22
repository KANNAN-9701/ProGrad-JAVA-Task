import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of units       :");
        int unit=sc.nextInt();
        sc.close();
        int amount=0;
        if(unit<=50){
            amount+=(0.50f*unit);
        }
        else if(unit<=150){
            amount+=(0.50f*50)+(0.75f*(unit-50));
        }
        else if(unit<=250) {
            amount+=(0.50f*50)+(0.75f*100)+(1.20f*(unit - 150));
        }
        else{
            amount+=(0.50f*50)+(0.75f*100)+(1.20f*100)+(1.50f*(unit-250));
        }
        System.out.println("Your Electricity Bill Amount is :"+(amount+(amount*0.2f))+" Rs");

    }
}
