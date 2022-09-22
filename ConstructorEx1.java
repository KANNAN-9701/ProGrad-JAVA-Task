import java.util.Scanner;

public class ConstructorEx1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Length :");
        int l=sc.nextInt();
        System.out.print("Enter the width :");
        int w=sc.nextInt();
        System.out.print("Enter the height :");
        int h=sc.nextInt();
        Room obj=new Room();
        obj.setLength(l);
        obj.setWidth(w);
        obj.setHeight(h);
        obj.area();
        obj.volume();

    }
}
class Room{
    private int length;
    private int width;
    private int height;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void area(){
        System.out.println("Area of the room is   :"+getLength()*getWidth());
    }
    public void volume() {
        System.out.println("Volume of the room is :" +getLength() *getWidth() *getHeight());
    }
}
