import java.util.Scanner;
public class FindThirdAngle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Angle  :");
        Byte firstAngle=sc.nextByte();
        System.out.print("Enter the Second Angle :");
        Byte secondAngle=sc.nextByte();
        sc.close();
        System.out.println("Third Angle is         :"+(180-(firstAngle+secondAngle)));
        
    }
    
}
