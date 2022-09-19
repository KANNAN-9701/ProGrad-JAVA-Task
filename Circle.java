import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        float radius,area,perimeter;
        final float PI=3.14f;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle :");
        radius=sc.nextFloat();
        sc.close();
        area=PI*(radius*radius);
        System.out.println("The Area of the cicrle is      :"+area);
        perimeter=2*PI*radius;
        System.out.println("The Perimeter of the circle is :"+perimeter);

    }

    
}
