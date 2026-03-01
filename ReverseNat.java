//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReverseNat {
    public static void main(String[] args) {
        System.out.println("Natural Number");
        funRev(8);
        System.out.println("Reverse Natural Number");
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
}