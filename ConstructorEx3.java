import java.util.Scanner;

public class ConstructorEx3 {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void cube(){
        for(int i=1;i<=getNum();i++){
            System.out.println(i+" cube is "+(int)Math.pow(i,3));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numbers:");
        int num=sc.nextInt();

        ConstructorEx3 obj=new ConstructorEx3();
        obj.setNum(num);
        obj.cube();

    }
}
