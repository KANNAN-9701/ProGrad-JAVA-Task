import java.util.Scanner;
public class MeterToKm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Meter value :");
        int meter=sc.nextInt();
        sc.close();
        System.out.println(meter+" Meter is "+(meter/1000f)+" KM");
    }
    
}
