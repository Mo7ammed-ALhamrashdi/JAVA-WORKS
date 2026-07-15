public class MultiplicationCalculator {
    public static void main(String[] args) {
        int start = 1;
        int end = 5;
        int result = 1;
        for (int i = start; i <= end; i++) {
            result = result * i;

        }
        System.out.println("Final Result: " + result);
    }
}
