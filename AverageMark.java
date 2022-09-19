import java.util.*;
public class AverageMark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Java Mark :");
        byte java=sc.nextByte();
        System.out.print("Enter Python Mark :");
        byte python=sc.nextByte();
        System.out.print("Enter mysql Mark :");
        byte mysql=sc.nextByte();
        sc.close();
        float average=(java+python+mysql)/3f;
        System.out.println("Average is :"+average);
        }   
}
