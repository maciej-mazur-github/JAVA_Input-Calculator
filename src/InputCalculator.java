import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int counter = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                break;
            }
        }

        average = Math.round((double) sum / (double) counter);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
