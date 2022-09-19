import java.util.Scanner;
public class TransposeMatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num of rows in Matrix :");
        byte row1=sc.nextByte();
        System.out.print("Enter the num of cols in Matrix :");
        byte col1=sc.nextByte();
        int [][]arr1=new int[row1][col1];
       // int [][]tra=new int[row1][col1];
            System.out.print("Enter the Elements Matix :");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    arr1[i][j]=sc.nextInt();
                }
            }
            sc.close();
            System.out.println("Matrix is :");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Transpose Matrix is :");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(arr1[j][i]+" ");
                }
                System.out.println();
            }
}
}
