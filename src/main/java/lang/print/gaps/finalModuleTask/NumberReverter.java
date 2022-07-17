package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
            int first = number % 10;
            int second = (number / 10) % 10;
            int third = number / 100;
            int reversedNumber = first * 100 + second * 10 + third;
            System.out.println(reversedNumber);
//        String reversed = String.valueOf(number);
//            String result = "";
//            char first ;
//            for (int i = 0; i < reversed.length(); i++) {
//                first = reversed.charAt(i);
//                result = first + result;
//            }
//            int num = Integer.parseInt(result);
//            System.out.println(num);
        }

    public static void main(String[] args) {
        NumberReverter numberReverter = new NumberReverter();
        numberReverter.revert(334);
    }
}
