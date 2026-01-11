public class StringReverseChar2 {
    public static void main(String[] args) {
        String original = "Kanhaiya";
        String reversed = "";

        // Reverse loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed +=  original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}
