import java.util.Scanner;
public class CheckPrimeNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num=sc.nextInt();
        sc.close();
        byte temp=0;
        if(num>1){
            for(int i=2;i<num;i++){
                if(num%i==0){
                    System.out.println(num+" is Not Prime Number");
                    temp=1;
                    break;
                }
            }
            if(temp==0){
                System.out.println(num+" is Prime Number");
            }
        }
        else{
            System.out.println("Invalid Number...Please Check");
        }

    }
}