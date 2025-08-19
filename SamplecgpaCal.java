import java.util.Scanner;

public class CGPACal {
    public static void main(String[] args) {
        System.out.println("<------  Normal CGPA Calculator  ------> ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks Sub1 : ");
        float s1 = sc.nextFloat();
        System.out.println("Enter Marks Sub2 : ");
        float s2 = sc.nextFloat() ;
        System.out.println("Enter Marks Sub3 : ");
        float s3 = sc.nextFloat();
        float cgpa = (s1+s2+s3 )  / 30;
        System.out.println("Your CGPA is "+cgpa);
    }
}
