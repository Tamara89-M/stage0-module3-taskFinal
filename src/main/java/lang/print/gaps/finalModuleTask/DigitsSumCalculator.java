package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = number % 10;
        int second = (number / 10) % 10;
        int third = (number / 100) % 10;
        int fourth = number / 1000;
        int sum = first + second + third + fourth;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        DigitsSumCalculator digitsSumCalculator = new DigitsSumCalculator();
        digitsSumCalculator.calculateSum(1234);
    }
}
