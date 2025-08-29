import java.util.Scanner;

public class Pattern {
    //pattern printing while loop
//    Enter Number of Rows : 4
//            * * * *
//            * * *
//            * *
//            *
    public static void main(String[] args) {
        System.out.print("Enter Number of Rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        while(i>0){
            int j = 0;
            while(j<i){
                System.out.print("* ");
                j++;
            }
            System.out.print("\n");
            i--;
        }

    }
}
