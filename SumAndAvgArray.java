import java.util.Scanner;
public class SumAndAvgArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        byte num=sc.nextByte();
        int[] array=new int[num];
        int sum=0;
        System.out.print("Enter the Elements :");
        for(int i=0;i<num;i++){
            array[i]=sc.nextInt();
        }
        for(int j:array){
            sum+=j;
        }
        System.out.println("Sum of Elements is     :"+sum);
        System.out.println("Average of Elements is :"+((float)(sum)/array.length));

    }
}
