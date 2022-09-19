import java.util.Scanner;
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Decimal Value :");
        int num=sc.nextInt();
        sc.close();
        int[] arr =new int[40];
        int i=0;
        while(num>0){
            arr[i]=num%2;
            num/=2;
            i++;
        }
        System.out.print("Binary value is       :");
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }

    }
}
