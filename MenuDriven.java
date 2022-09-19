import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" \n 1.Odd or Even \n 2.Positive or Negative \n 3.Find Maximum Number \n 4.Convert Days into Months \n\nEnter Your Choice    :");
        byte choice=sc.nextByte();
         
        switch(choice){
            case 1:{
                System.out.print("Enter a Number :");
                int num1=sc.nextInt();
                System.out.println("The given number is "+((num1%2==0)?"Even":"ODD"));
                break;
            }
            case 2:{
                System.out.print("Enter a Number :");
                int num1=sc.nextInt();
                System.out.println("The given number is "+((num1>=0)?"Positive":"Negative"));
                break;
            }
            case 3:{
                System.out.print("Enter the First Number  :");
                int num1=sc.nextInt();
                System.out.print("Enter the Second Number :");
                int num2=sc.nextInt();
                System.out.println("Maximum of the given number is "+((num1>num2)?num1:num2));
                break;
            }
            case 4:{
                System.out.print("Enter the days :");
                int days=sc.nextInt();
                System.out.println((days/30)+" Months and "+(days%30)+" Days are remaining");
                break;
            }
            default :{
                System.out.println("Invalid Choice....please check and try again...");
            }
        } 
        sc.close();
    }   
   
}
