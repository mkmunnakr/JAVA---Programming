import java.util.Scanner;

public class markPercentage {
    public static void main(String[] args) {
        System.out.println("Calculate Marks Percentage of a given Student");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks 1 to 100 Sub1 : ");
        float a = sc.nextFloat();
        System.out.print("Enter Marks 1 to 100 Sub2 : ");
        float b = sc.nextFloat();
        System.out.print("Enter Marks 1 to 100 Sub3 : ");
        float c = sc.nextFloat();
        System.out.print("Enter Marks 1 to 100 Sub4 : ");
        float d = sc.nextFloat();
        System.out.print("Enter Marks 1 to 100 Sub5 : ");
        float e = sc.nextFloat();

        float percentage = (a+b+c+d+e) / 5;

        System.out.print("Percentage of Student in Exam : ");
        System.out.println(percentage);

    }
}
