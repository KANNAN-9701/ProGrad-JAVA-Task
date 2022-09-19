import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your percentage  :");
        int percentage=sc.nextInt();
        sc.close();
        System.out.println("You are "+(percentage>=40?"pass":"Fail"));
         
    }
    
}
