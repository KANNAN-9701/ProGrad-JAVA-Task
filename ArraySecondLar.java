import java.util.Scanner;
public class ArraySecondLar { 
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
        for(int i=0;i<num;i++){
             for(int j=i+1;j<num;j++){
                 if(arr[i]>arr[j]){
                     int te=arr[i];
                     arr[i]=arr[j];
                     arr[j]=te;
                 }
             }
         }

        for(int i=num-2;i>=0;i--){
            if(arr[i]!=arr[num-1]){
                System.out.println("Second Largest Number is :"+arr[i]);
                return;
            }
        }
    System.out.println("all are same values...");    
         
    }
}
    



