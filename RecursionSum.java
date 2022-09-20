import java.util.Scanner;
public class RecursionSum{
    public int  sumNum(int n){
            if(n!=0){
                return n+sumNum(n-1);
            }
            else{
                return n;
                }
        }
            public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Number :");
            int num=sc.nextInt();
            RecursionSum obj=new RecursionSum();
            int ans=obj.sumNum(num);
            System.out.println("Sum of 1 to "+num+" is = "+ans);

        }
    }

