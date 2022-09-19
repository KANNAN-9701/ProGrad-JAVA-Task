import java.util.Scanner;
public class BonusCalculation {
    public static void main(String[] args) {
        float basicSalary,ta,da,hra,pf,bonus;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Basic Salary     :");
        basicSalary=sc.nextFloat();
        sc.close();
        if(basicSalary>=20000)
            bonus=0.1f*basicSalary;
        else
            bonus=0.2f*basicSalary;
        ta=0.1f*basicSalary;
        da=0.15f*basicSalary;
        hra=0.2f*basicSalary;
        pf=0.12f*basicSalary;
        System.out.println("Your Gross(Final) Salary is :"+((basicSalary+da+ta+hra+bonus)-pf));
        


        

    }
    
}
