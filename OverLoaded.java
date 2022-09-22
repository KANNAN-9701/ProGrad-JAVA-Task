import java.util.Scanner;
public class OverLoaded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" \n 1.Area of Circle \n 2.Area of Square \n 3.Area of Rectangle \n 4.Area of Triangle \n\nEnter Your Choice    :");
        byte choice = sc.nextByte();
        OverLoaded obj = new OverLoaded();
        switch(choice){
            case 1: {
                System.out.print("Enter the Radius of Circle :");
                float radius = sc.nextFloat();
                obj.add(radius);
                break;
            }
            case 2: {
                System.out.print("Enter the Side value of Square :");
                int side = sc.nextInt();
                obj.add(side);
                break;
            }
            case 3: {
                System.out.print("Enter the Length of Rectangle :");
                int length = sc.nextInt();
                System.out.print("Enter the Width of Rectangle  :");
                int width = sc.nextInt();
                obj.add(length,width);
                break;
            }
            case 4: {
                System.out.print("Enter the base value of Triangle :");
                float base = sc.nextInt();
                System.out.print("Enter the height value of Triangle :");
                float height = sc.nextInt();
                obj.add(base,height);
                break;
            }
            default: {
                System.out.println("Invalid Choice....please check and try again...");
            }
        }
    }

        public  void add(int radius){
            System.out.println("Area of the circle is :"+(Math.PI*radius*radius));
        }
        public  void  add(float side){
            System.out.println("Area of the Square is :"+(side*side));
        }
        public  void  add(int length,int width){
            System.out.println("Area of the Rectangle is :"+(length*width));
        }
        public  void  add(float base,float height){
            System.out.println("Area of the Triangle is"+(0.5f*base*height));
        }

}
