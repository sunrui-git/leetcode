package com.example.demo.l_501;

public class l_501_510 {

    public static void main(String[] args) {
        System.out.println(fib_509(7));
    }
    // 509 斐波那契数列
    // 该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和
    public static int fib_509(int n){
        if(n < 2){
            return n;
        }
        int first = 0;
        int second = 1;
        for(int i = 2; i <= n; i++){
            int temp = second;
            second = first + second;
            first = temp;
        }
        return second;
    }
}
