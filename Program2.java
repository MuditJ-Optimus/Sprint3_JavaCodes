/*Write a method that checks whether a given integer is positive, negative, or zero and prints an appropriate message. */
    

public class Program2 {
    public static void checkNumber(int num){
        if (num>0){
            System.out.println(num+" is a positive integer.");
        }
        else if (num<0){
            System.out.println(num+" is a negative integer.");
        }
        else{
            System.out.println(num+" is zero.");
        }
    }
    public static void main(String[] args) {
        checkNumber(10);  
        checkNumber(-5);  
        checkNumber(0);   
    }
}
