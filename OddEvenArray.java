import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        byte num=sc.nextByte();
        int[] array=new int[num];
        System.out.print("Enter the Elements :");
        for(int k=0;k<num;k++){
            array[k]=sc.nextInt();
        }
        int o=0,e=0;
        for(int n:array){
            if(n%2==0)
                e++;
            else
                o++;
        }
        int[] odd=new int[o];
        int[] even=new int[e];
        int i=0,j=0;
        for(int n:array){
            if(n%2==0)
                even[i++]=n;
            else
                odd[j++]=n;
        }
        System.out.print("Odd number is  :");
        for(int x:odd){
            System.out.print(x+" ");
        }
        System.out.print("\nEven number is :");
        for(int y:even){
            System.out.print(y+" ");
        }
    }
}
