import java.util.Scanner;
public class AlphabetOrDegits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Character  :");
        char chr=sc.nextLine().charAt(0);
        sc.close();
        if((chr>='a'&&chr<='z')||(chr>='A'&&chr<='Z')){
            System.out.println(chr+" This is Alphabet");
        }
        else{
            System.out.println(chr+" This is a Digits");
        }
         
    }
    
}