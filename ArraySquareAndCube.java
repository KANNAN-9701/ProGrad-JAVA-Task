import java.util.Scanner;
public class ArraySquareAndCube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of elemnts you want :");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.print("Enter a elements    :");
        for(int i=0;i<num;i++){
           arr[i]=sc.nextInt();
        }
        System.out.print("Square elements are :");
        for(int j=0;j<num;j++){
            System.out.print(arr[j]*arr[j]+" ");
        }
        System.out.println();
        System.out.print("Cube elements are   :");
        for(int k=0;k<num;k++){
            System.out.print(arr[k]*arr[k]*arr[k]+" ");
        }
        sc.close();
    }
}
