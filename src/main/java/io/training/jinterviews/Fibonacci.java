package io.training.jinterviews;

public class Fibonacci {
    public int fibonacciRecursion(int n){
        int sum;
        if(n <= 0){
            return 0;
        } else if(n == 1){
            return 1;
        }
        sum = fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
        return sum;
    }
    public int fibonacciSchleife(int n){
        if(n <= 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }

        int start = 0;
        int next = 1;
        int sum = 0 ;
        for(int i = 2; i <= n; i++){
            sum = start + next;
            start = next;
            next = sum;
        }
        return sum;
    }
}
