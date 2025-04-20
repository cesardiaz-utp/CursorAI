package ejercicios.java;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Example {
    public static List<Integer> calculatePrimesBasic(int n) {
        List<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < n) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    public static double divideNumbers(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        var primeList = calculatePrimesBasic(10);
        System.out.println("First 10 primes: " + primeList);

        // Demostración de la función de división
        int num1 = 10;
        int num2 = 5;
        // int num2 = 0;
        System.out.println(num1 + " / " + num2 + " = " + divideNumbers(num1, num2));

        System.out.println("Hello world")
    }
}