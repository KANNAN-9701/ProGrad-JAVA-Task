import java.util.Scanner;
public class armstrongNumGivenRange {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Starting Number :");
        int sta=sc.nextInt();
        System.out.print("Enter the Ending   Number :");
        int end=sc.nextInt();
        sc.close();
        System.out.print("Armstrong Numbers are     :");
        for(int num=sta;num<=end;num++) {
            int len=String.valueOf(num).length();
            int ans=0;
            int temp=num;
            while (temp > 0) {
                ans += (Math.pow(temp % 10,len));
                temp /= 10;
            }
            if (num == ans) {
                System.out.print(num + " ");
            }
        }
    }
}
