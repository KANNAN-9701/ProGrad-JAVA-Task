import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num=sc.nextInt();
        sc.close();
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    System.out.print(i+" ");
                }
            }
}
}

