import java.util.Scanner;
public class Pattern1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of rows want to print :");
        int num=sc.nextInt();
        sc.close();
        int k=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k+=1;
            }
            System.out.println();
        }
        
    }
}
