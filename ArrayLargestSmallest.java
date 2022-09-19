import java.util.Scanner;
public class ArrayLargestSmallest { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of elemnts you want :");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.print("Enter the Elements :");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                 if(arr[i]>arr[j]){
                     int te=arr[i];
                     arr[i]=arr[j];
                     arr[j]=te;
                 }
             }
         }
        System.out.println("Largest Number is     :"+arr[0]);
        System.out.println("Smallest Number is    :"+arr[num-1]);
         
    }
}
    


