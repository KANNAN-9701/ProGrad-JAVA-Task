import java.util.*;
public class Unicode {
    public static void main(String[] args) {
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Character                  :");
        c=sc.next().charAt(0);
        sc.close();
        int uni=c;
        System.out.println("The UNICODE of the given Charater is :"+uni);    }
    
}
