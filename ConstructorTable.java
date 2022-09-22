import java.util.Scanner;

public class ConstructorTable {
    private int num;

    public int getNum() {

        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void table(){
        for(int i=1;i<=10;i++){
            System.out.println(i+" X "+num+" = "+i*getNum());
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of table :");
        int num=sc.nextInt();

        ConstructorTable obj=new ConstructorTable();
        obj.setNum(num);
        obj.table();

    }
}
