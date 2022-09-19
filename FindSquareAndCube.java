import java.util.Scanner;
public class FindSquareAndCube{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number           :");
        int number=sc.nextInt();
        sc.close();
        System.out.println("Square of a given Number :"+(int)Math.pow(number, 2));
        System.out.println("Cube of a given Number   :"+(int)Math.pow(number, 3));
        
        
    }
}