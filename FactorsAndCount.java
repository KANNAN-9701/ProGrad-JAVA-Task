import java.util.Scanner;
public class FactorsAndCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number      :");
        int num=sc.nextInt();
        sc.close();
        int count=0;
        System.out.print("Factor are          :");
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    System.out.print(i+" ");
                    count++;
                }
            }
        System.out.println();
        System.out.println("Count of Factors is :"+count);
}
}

