import java.util.Scanner;

public class ps04_TaxPaid {
    // Tax is show
    public static void main(String[] args) {
        System.out.print("Enter the amount in lakhs : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat() ;
        if(amount < 250000 ) {
            System.out.println("No Tax Paid ");
        }
        else if(amount < 500000){
            System.out.println("Tax is Paid 5% ");
        }
        else if (amount >500000 && amount < 1000000){
            System.out.println("Tax is Paid 20% ");
        }
        else {
            System.out.println("Tax is Paid 30% ");
        }

    }
}
