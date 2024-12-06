/*Write a Java program that declares two integer variables, a and b. Perform the following operations and print the results:

Addition
Subtraction
Multiplication
Division (ensure no division by zero occurs)
Modulo*/
class ArithmeticOp {

    int a;
    int b;

    ArithmeticOp(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void additionOperation() {
        System.out.println("Addition:" + (a + b));
    }

    public void subtractionOperation() {
        System.out.println("Subtraction:" + (a - b));
    }

    public void multiplicationOperation() {
        System.out.println("Multiplication:" + (a * b));
    }

    public void divisionOperation() {
        System.out.println("Division:" + (a / b));
    }

    public void modulusOperation() {
        System.out.println("Modulus:" + (a % b));
    }
}

public class Program1 {

    public static void main(String[] args) {
        ArithmeticOp obj = new ArithmeticOp(10, 5);
        obj.additionOperation();
        obj.subtractionOperation();
        obj.multiplicationOperation();
        obj.divisionOperation();
        obj.modulusOperation();
    }
}
