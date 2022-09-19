import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter a Number :");
        int num=sc.nextInt();
        sc.close();
        for(int i=1;i<=10;i++){
            System.out.println(i+" X "+num+" = "+i*num);
    }
}
}