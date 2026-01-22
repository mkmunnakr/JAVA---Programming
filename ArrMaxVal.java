public class ArrMaxVal {
        public static void main(String[] args) {
            int[] numbers = {10, 25, 8, 44, 32, 55};
            int max = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];

                }
            }
            System.out.println("Max Num is "+ max);

        }
}
