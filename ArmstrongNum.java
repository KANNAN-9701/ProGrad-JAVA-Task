import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        int ans=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num=sc.nextInt();
        sc.close();
        int temp=num;
        while(num>0){
            ans+=(Math.pow(num%10,3));
            num/=10;
        }
        if(temp==ans){
             System.out.println(temp+" is Armstrong Number");       
        }
        else{
            System.out.println(temp+" is Not Armstrong Number");
        }
}       
}
