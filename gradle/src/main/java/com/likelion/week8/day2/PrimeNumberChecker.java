package com.likelion.week8.day2;

public class PrimeNumberChecker {

    /*
    1번 방법 : 2부터 판별하는 수 전까지 나눠보고 나머지가 0이 안나온다면 소수
    2번 방법 : 주어진 숫자 / 2를 소숫점 버린 숫자까지 나누어 보고 나머지가 0이 아니면 소수
    3번 방법 : 주어진 숫자의 제곱근까지 나누어 보고 나머지가 0이 아니면 소수
     */

    // 1번 방법
    public boolean solution(int number) {
        boolean answer = true;

        for(int i = 2; i < number; i++) { if(number % i == 0) answer = false; }
        return answer;
    }

    // 2번 방법
    public boolean solution2(int number) {
        boolean answer = true;

        for(int i = 2; i <= Math.floor(number/2); i++) { if(number % i == 0) answer = false; }
        return answer;
    }

    // 3번 방법
    public boolean solution3(int number) {
        boolean answer = true;

        for(int i = 2; i <= Math.sqrt(number); i++) { if(number % i == 0) answer = false; }
        return answer;
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