import java.util.Scanner;

public class MultipleClasses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Company name :");
        String n=sc.nextLine();
        System.out.print("Enter the RAM size :");
        byte r=sc.nextByte();
        System.out.print("Enter the Price    : ");
        int p=sc.nextInt();

        Laptop obj=new Laptop(n,r,p);
        obj.display();
        Computer obj1=new Computer(n,r,p);
        obj1.display();
    }
}
class Laptop{
    String name;
    byte ram;
    int price;

    public Laptop(String name, byte ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }
    public void display(){
        System.out.println(name+" laptop is "+ram+" gb ram and the price is "+price+" Rs.");
    }
}
class Computer{
    String name;
    byte ram;
    int price;

    public Computer(String name, byte ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }
    public void display(){
        System.out.println(name+" computer is "+ram+" gb ram and the price is "+price+" Rs.");
    }
}
