import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num=sc.nextInt();
        sc.close();
        int temp=2;
        while(num>1){
            if(num%temp==0){
                System.out.print(temp+" ");
                num/=temp;
            }
            else{
                temp+=1;
            }
        }      
    }
}
