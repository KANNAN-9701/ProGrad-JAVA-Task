import java.util.Scanner;

public class RecursionTable {

    public static void  table(int n, int i){
        if(i<=10){
            System.out.println(i+" X "+n+" = "+n*i);
            table(n,i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num=sc.nextInt();
        table(num,1);

    }
}
