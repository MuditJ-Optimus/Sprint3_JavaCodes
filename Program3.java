//Write Java methods that prints all even numbers between 1 and 10 (inclusive) using a for loop, a while loop and a do-while loop.

public class Program3 {

    public static void usingFor() {
        System.out.println("Printing even numbers between 1 and 10 using for loop");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

    public static void usingWhile() {
        System.out.println("Printing even numbers between 1 and 10 using while loop");
        int i = 2;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println("");
    }

    public static void usingDoWhile() {
        System.out.println("Printing even numbers between 1 and 10 using do-while loop");
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 10);
        System.out.println("");
    }

    public static void main(String[] args) {
        usingFor();
        usingWhile();
        usingDoWhile();
    }
}
