import java.util.Scanner;
public class CheckValidTriangle {
    public static void main(String[] args) {
        byte firstVal,secondVal,thirdVal;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Angle  :");
        firstVal=sc.nextByte();
        System.out.print("Enter the Second Angle :");
        secondVal=sc.nextByte();
        System.out.print("Enter the Third Angle  :");
        thirdVal=sc.nextByte();
        sc.close();
        if(firstVal<=0 || secondVal<=0 || thirdVal<=0){
            System.out.println("\t This is Invalid angle..please check...");
        }
        else{
            if(firstVal+secondVal+thirdVal==180)
                System.out.println("\tThis is Valid Triangle...");
            else
                System.out.println("\tThis is Invalid Triangle...");
        }

    }
    
}
