public class LargestNumberFinder {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 34, 67};
        int largest = numbers[0];
        int number;
        for (int i = 0; i < numbers.length; i++) {
            number = numbers[i];
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest Number: " + largest);
    }
}

