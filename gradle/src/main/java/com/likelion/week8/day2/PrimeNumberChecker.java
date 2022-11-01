package com.likelion.week8.day2;

public class PrimeNumberChecker extends PrimeNumber{

    /*
    1번 방법 : 2부터 판별하는 수 전까지 나눠보고 나머지가 0이 안나온다면 소수
    2번 방법 : 주어진 숫자 / 2를 소숫점 버린 숫자까지 나누어 보고 나머지가 0이 아니면 소수
    3번 방법 : 주어진 숫자의 제곱근까지 나누어 보고 나머지가 0이 아니면 소수
     */

    // 1번 방법
    public boolean solution1(int number) {
        return super.solution(number, num -> num);
    }

    // 2번 방법
    public boolean solution2(int number) {
        return  super.solution(number, num -> num / 2);
    }

    // 3번 방법
    public boolean solution3(int number) {
        return super.solution(number, num -> (int) Math.sqrt(num) + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {13, 17, 19, 23, 25};
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();

        for(int number : numbers) {
            boolean checked = primeNumberChecker.solution3(number);
            System.out.printf("주어진 수가 소수면 true, 아니면 false일 때, 주어진 수는 소수인가? 주어진 수 : %d, 정답 : %s\n", number, checked);
        }
    }
}