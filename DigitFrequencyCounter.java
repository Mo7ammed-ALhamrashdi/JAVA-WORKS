public class DigitFrequencyCounter {
    public static void main(String[] args) {
        int number = 122333;
        int originalNumber = number;
        int targetDigit = 3;
        int count = 0;
        int digit;
        while (number != 0) {
            digit = number % 10;
            if (digit == targetDigit) {
                count++;
            }
            number = number / 10;
        }
        System.out.println("Number: " + originalNumber);
        System.out.println("Target Digit: " + targetDigit);
        System.out.println("Frequency: " + count);

    }
}
