import java.util.Scanner;
public class FinalAmount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal amount :");
        int principalAmount=sc.nextInt();
        System.out.print("Enter the duration of loan :");
        int duration=sc.nextInt();
        sc.close();
        float simpleInterset=((principalAmount*duration*7.5f)/100);
        System.out.println("Simple Interest            :"+simpleInterset);
        System.out.println("Final Amount               :"+(principalAmount+simpleInterset));

    }
    
}
