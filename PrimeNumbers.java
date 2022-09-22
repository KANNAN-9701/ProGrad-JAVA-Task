import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Starting Range :");
        int sta=sc.nextInt();
        System.out.print("Enter a Ending  Range :");
        int end=sc.nextInt();
        sc.close();
        byte temp=0;
        if(sta>1){
            for(int i=sta;i<=end;i++){
                for(int num=2;num<i;num++){
                    if(i%num==0){
                        temp=1;
                        break;
                    }
                }
                if(temp==0){
                    System.out.print(i+" ");}
                temp=0;
            }
        }
        else{
            System.out.println("Invalid Number...Please Check");
        }

    }
}