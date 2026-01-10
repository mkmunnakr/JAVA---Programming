import java.util.Scanner;

public class StringWordReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        // sc.next() ki jagah sc.nextLine() use karein poori line ke liye
        String s = sc.nextLine();

        // 1. Space (" ") ke basis par split karein, sirf ("") se nahi
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        // 2. Peeche se loop chalaiye
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(words[i]);
            }
        }

        System.out.println("Reversed sentence: " + result.toString());
    }
}