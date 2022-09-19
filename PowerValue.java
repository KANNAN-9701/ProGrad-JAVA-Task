import java.util.Scanner;
public class PowerValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter X (base value)  :");
        int base=sc.nextInt();
        System.err.print("Enter Y (power value) :");
        int pow=sc.nextInt();
        sc.close();
        int ans=1;
        for(int i=1;i<=pow;i++){
            ans*=base;
        }
        System.out.println(base+" power "+pow+" is "+ans);
    }
}
