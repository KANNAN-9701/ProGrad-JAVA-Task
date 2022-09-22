import java.util.Scanner;

public class Car {
    String brand;
    String model;
    String color;
    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    public void display(){
        System.out.println("The Car Brand is :"+brand);
        System.out.println("The Car Model is :"+model);
        System.out.println("The Car Color is :"+color);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Brand :");
        String b=sc.nextLine();
        System.out.print("Enter the Model :");
        String m=sc.nextLine();
        System.out.print("Enter the Color :");
        String c=sc.nextLine();
        Car obj=new Car(b,m,c);
        obj.display();
    }
}
