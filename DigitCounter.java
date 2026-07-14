public class DigitCounter {
    public static void main(String[] args) {
        int number = 123456;
        int originalNumber = number;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println("Number: " + originalNumber);
        System.out.println("Number of digits: " + count);
    }
}

