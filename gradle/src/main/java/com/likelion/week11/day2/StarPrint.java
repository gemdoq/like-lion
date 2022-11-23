package com.likelion.week11.day2;

public class StarPrint {
    public static void main(String[] args) {
        StarPrint starPrint = new StarPrint();
        starPrint.print(5);
        System.out.printf("\n%s", starPrint.print2(5));
    }

    public void print(int num) {
        if(num == 0) return;
            System.out.printf("%s", "*");
            print(num-1);
    }

    public String print2(int num) {
        if(num == 0) return "";
        return "*"+print2(num-1);
    }
}