/*Write a Java program that calculates the sum of any number of integers passed as 
arguments. The program should take a variable number of integers and return their sum. 
Additionally, if no integers are passed, the method should return 0.*/
public class Program6 {

    public static void sum(int... numbers) {    //varargs
        int total = 0;

        for (int num : numbers) {
            total += num;
        }

        System.out.println("The sum is: " + total);
    }

    public static void main(String[] args) {
        sum(10);
        sum(10, 20, 30);
        sum();
    }
}
