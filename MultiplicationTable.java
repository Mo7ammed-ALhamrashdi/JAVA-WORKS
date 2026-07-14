public class MultiplicationTable {
    public static void main(String[] args) {

        // Declare the base number for the multiplication table
        int base = 9;

        // Loop from 1 to 10 (inclusive) to print each row of the table
        for (int i = 1; i <= 10; i++) {

            // Calculate the product of base and the current counter value
            int result = base * i;

            // Print each line in the format: base x counter = result
            System.out.println(base + " x " + i + " = " + result);
        }
    }

}
