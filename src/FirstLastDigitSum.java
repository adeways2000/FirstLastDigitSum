/*
 * Similar to previous exercise, this time I am only accounting for the sum of the first and last digit of a number
 * Note* if the 'number' is negative, then it returns -1 and if the 'number' is 0, then it returns 0;
 */

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        else if (number == 0) {
            return 0;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            firstDigit = number % 10;
            number /= 10;
        }

        int sum = firstDigit + lastDigit;
        return sum;
    }
}