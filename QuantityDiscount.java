import java.util.Scanner;
public class QuantityDiscount {
    public static void main(String[] args) {
        float price;
        Byte quantity;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Price per itms :");
        price=sc.nextFloat();
        System.out.print("Enter the Quantity       :");
        quantity=sc.nextByte();
        sc.close();
        if(quantity>=10){
            System.out.println("Final Amount is          :"+((price*quantity)-(price*quantity*0.1)));
        }
        else{
            System.out.println("Final Amount is          :"+(price*quantity));
        }

    }
    
}
