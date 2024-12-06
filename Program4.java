//Write a program that finds the largest and smallest numbers in an array of integers.

public class Program4 {

    public static void main(String[] args) {
        int[] numbers = {12, 45, 3, 19, 67, 29};
        findMinMax(numbers);
    }

    public static void findMinMax(int[] numbers) {
        int maxint = numbers[0];
        int minint = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxint) {
                maxint = numbers[i];
            }
        }
        System.out.println("The largest element is : " + maxint);
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minint) {
                minint = numbers[i];
            }
        }
        System.out.println("The smallest element is : " + minint);
    }
}
