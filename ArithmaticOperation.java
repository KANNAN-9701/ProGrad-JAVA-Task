import java.util.Scanner;
public class ArithmaticOperation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number  :");
        int firstNum=sc.nextInt();
        System.out.print("Enter the Second Number :");
        int secondNum=sc.nextInt();
        sc.close();
        System.out.println("Addition of two Number is       :"+(firstNum+secondNum));
        System.out.println("Subtraction of two Number is    :"+(firstNum-secondNum));
        System.out.println("Multiplication of two Number is :"+(firstNum*secondNum));
        System.out.println("Devision of two Number is       :"+(firstNum/secondNum));
        System.out.println("Modulus of two Number is        :"+(firstNum%secondNum));


    }
    
}
