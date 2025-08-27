import java.util.Scanner;
//pattern printing
//Enter Number of Rows : 4
//        * * * *
//        * * *
//        * *
//        *
        public class ps05_pr01Pattern {
    public static void main(String[] args) {
        System.out.print("Enter Number of Rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n; i >0; i--) {
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
