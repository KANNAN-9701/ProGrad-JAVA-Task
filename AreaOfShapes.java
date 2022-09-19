import java.util.Scanner;
public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" \n 1.Area of Circle \n 2.Area of Square \n 3.Area of Rectangle \n 4.Area of Triangle \n\nEnter Your Choice    :");
        byte choice=sc.nextByte();
        switch(choice){
            case 1:{
                System.out.print("Enter the Radius of Circle :");
                int radius=sc.nextInt();
                System.out.println("Area of the circle is :"+(Math.PI*radius*radius));
                break;
            }
            case 2:{
                System.out.print("Enter the Side value of Square :");
                int side=sc.nextInt();
                System.out.println("Area of the Square is :"+(side*side));
                break;
            }
            case 3:{
                System.out.print("Enter the Length of Rectangle :");
                int length=sc.nextInt();
                System.out.print("Enter the Width of Rectangle  :");
                int width=sc.nextInt();
                System.out.println("Area of the Rectangle is :"+(length*width));
                break;
            }
            case 4:{
                System.out.print("Enter the base value of Triangle :");
                int base=sc.nextInt();
                System.out.print("Enter the height value of Triangle :");
                int height=sc.nextInt();
                System.out.println("Area of the Triangle is"+(0.5f*base*height));
                break;
            }
            default :{
                System.out.println("Invalid Choice....please check and try again...");
            }
        } 
        sc.close();
    }   
}
