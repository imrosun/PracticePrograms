// Fibonacci of number using formula
package Uploaded;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciUsingFormula(10));
    }
    static int fibonacciUsingFormula(int n){
        return (int)(Math.pow((1+Math.sqrt(5))/2,n)/Math.sqrt(5));
    }
}
