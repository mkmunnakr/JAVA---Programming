//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CheckEven {
    public static void main(String[] args) {
        int n = 64;
        System.out.println(isEven(n));

    }
     static boolean isEven( int num) {
        return (num & 1) != 1;
     }
}