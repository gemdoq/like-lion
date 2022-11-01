package com.likelion.week8.day2;

public abstract class PrimeNumber {
    boolean solution(int number, StatementStrategy statementStrategy) {
        boolean answer = true;
        for(int i = 2; i < statementStrategy.condition(number); i++) {
            if(number % i == 0) answer = false;
        }
        return answer;
    }
}