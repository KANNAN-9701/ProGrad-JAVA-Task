import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of rows want to print :");
        int num=sc.nextInt();
        sc.close();
        for(int i=num;i>=1;i--){
            for(int j=num;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}

