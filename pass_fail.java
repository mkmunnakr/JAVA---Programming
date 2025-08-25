import java.util.Scanner;

public class pass_fail {
    //student pass or fail
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks sub1 : ");
        float m1 = sc.nextFloat() ;
        System.out.print("Enter the marks sub2 : ");
        float m2 = sc.nextFloat() ;
        System.out.print("Enter the marks sub3 : ");
        float m3 = sc.nextFloat() ;
        float per =(m1 + m2 + m3) / 3;
        if(per >= 40 && m1>=33 && m2 >=33 && m3 >=33){
            System.out.println("Congratulations You are  Pass");
        }
        else {
            System.out.println("Sorry You are Fail ! ");
        }
    }
}
