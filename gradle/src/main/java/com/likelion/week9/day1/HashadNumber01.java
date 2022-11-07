package com.likelion.week9.day1;

public class HashadNumber01 {
    /*
    자릿수의 합으로 나눠지는 수를 하샤드 수라고 한다.
    예를 들어 18은 자릿수의 합이 9이고, 18이 9로 나눠지기 때문에 하샤드의 수라 할 수 있다.
    자릿수의 합을 구하고 원래의 수를 자릿수의 합으로 나머지를 0인 연산을 해서 트루값이라면 그건 하샤드의 수다.
     */
    public boolean solution(int x) {
        boolean answer = false;

        int sumOfDigit = 0;
        int share = x;

        while ( share > 0 ) {
            sumOfDigit += share % 10;
            share /= 10;
        }
        if ( x%sumOfDigit == 0 ) {
            answer = true;
        }
        return answer;
    }

    public static void main(String[] args) {
        HashadNumber01 hashadNumber01 = new HashadNumber01();
        boolean result = hashadNumber01.solution(18);

        System.out.println(result);
    }
}