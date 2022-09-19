import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of rows you want :");
        byte num=sc.nextByte();
        int arr[][]=new int[num][];
        for(int i=0;i<num;i++){
            System.out.print("Enter the number of colums for "+(i+1)+" row :");
            int col=sc.nextInt();
            arr[i]=new int[col];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter elements :");
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Array is :");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("sum of rows :");
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            System.out.println("sum of "+i+" row is "+sum);
        }
    }
}
