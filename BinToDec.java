import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Binary Value :");
        int num=sc.nextInt();
        int bin=num;
        sc.close();
        while(num>0){
            if(num%10>1){
                System.out.println("The Given num is not binary num......");
                break;
            }
            num/=10;
        }
        int dec=0,i=0;
        while(bin!=0){
            dec+=((bin%10)*Math.pow(2, i));
            bin/=10;
            i++;
         }
         System.out.print("The Decimal Value is   :"+dec);
     
    }
}
