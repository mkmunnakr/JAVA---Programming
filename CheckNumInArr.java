public class CheckNumInArr {

        public static void main(String[] args) {
            int[] numbers = {10, 25, 8, 44, 32};
            int target = 44; // Hamein ye dhoondna hai

            boolean found = false;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == target) {
                    System.out.println("Number mil gaya index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Number nahi mila.");
            }
        }

}
