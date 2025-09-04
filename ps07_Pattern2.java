public class ps07_Pattern2 {
    //Pattern printing
//            * * * *
//            * * *
//            * *
//            *
    static void pattern(int n){
        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}
