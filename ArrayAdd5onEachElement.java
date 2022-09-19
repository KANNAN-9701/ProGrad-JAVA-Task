import java.util.Scanner;
public class ArrayAdd5onEachElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of elemnts you want :");
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Enter a element :");
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are :");
        for(int j=0;j<num;j++){
            System.out.println(arr[j]+5);
        }
        sc.close();
    }
}
