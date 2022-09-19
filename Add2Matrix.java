import java.util.Scanner;

public class Add2Matrix {
     static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num of rows in Matrix 1 :");
        byte row1=sc.nextByte();
        System.out.print("Enter the num of cols in Matrix 1 :");
        byte col1=sc.nextByte();
        System.out.print("Enter the num of rows in Matrix 2 :");
        byte row2=sc.nextByte();
        System.out.print("Enter the num of cols in Matrix 2 :");
        byte col2=sc.nextByte();
        int [][]arr1=new int[row1][col1];
        int [][]arr2=new int[row2][col2];
        if(row1==row2 && col1==col2){
            System.out.print("Enter the Elements in 1st Matix :");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    arr1[i][j]=sc.nextInt();
                }
            }
            System.out.print("Enter the Elements in 2nd Matix :");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    arr2[i][j]=sc.nextInt();
                }
            }
            sc.close();
            System.out.println("1st Matrix :");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(arr1[i][j]+" ");
            }
                System.out.println();
        }
            System.out.println("2nd Matrix :");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Addtion of two Matrix is :");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    System.out.print(arr1[i][j]+arr2[i][j]+" ");
                }
                System.out.println();
            }
    }
    else{
        System.out.println("rows and cols should be equal....");
    }
}
}
