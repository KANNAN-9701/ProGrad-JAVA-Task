import java.util.Scanner;
public class InsurancePolicy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Your Marital Status (Married/Unmarried) :");
        String maritalStatus=sc.nextLine();
        if(maritalStatus.equalsIgnoreCase("married"))
            System.out.println("=========> You are Insured...");
        else{
            System.out.print("Enter Your Gender(Male/Female) :");
            String gender=sc.nextLine();
            System.out.print("Enter Your Age                 :");
            byte age=sc.nextByte();
            if(gender.equalsIgnoreCase("male") && age>=30)
                System.out.println("=========> You are Insured...");
            else if(gender.equalsIgnoreCase("female") && age>=25)
                System.out.println("=========> You are Insured...");
            else
                System.out.println("=========> Sorry....You are Not Insured.....");
        }
        sc.close();   
    }  
}
