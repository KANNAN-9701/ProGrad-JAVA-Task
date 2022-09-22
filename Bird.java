import java.util.Scanner;

public class Bird {
    String type;
    int count;
    String color;
    public Bird(String type, int count, String color) {
        this.type = type;
        this.count = count;
        this.color = color;
    }
    public void display(){
        System.out.println("Type of bird is   :"+type);
        System.out.println("Count of bird  is :"+count);
        System.out.println("Color of bird is  :"+color);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the type of bird  :");
        String t=sc.nextLine();
        System.out.print("Enter number of birds   :");
        int co=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Color of bird :");
        String c=sc.nextLine();
        Bird obj=new Bird(t,co,c);
        obj.display();
    }
}

