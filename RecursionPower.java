import java.util.Scanner;
public class RecursionPower {
    public  static int  power(int x,int y){
        if(y>0){
            return (x*power(x,y-1));
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Base Value :");
        int x=sc.nextInt();
        System.out.print("Enter the Power Value :");
        int y=sc.nextInt();
        System.out.println(power(x,y));
    }
}
