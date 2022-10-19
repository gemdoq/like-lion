package week6.day2.algorithm;

public class Rhombus {
    int num = 5;
    String star = "*";

    int blank = (num-1)/2;
    int print = 1;
    int reverse = 0;

    public Rhombus(int num, String star) {
        this.num = num;
        this.star = star;
    }

    public void print() {
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= blank; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= print; k++) {
                System.out.print("*");
            }
            if(reverse==0) {
                blank--;
                print+=2;
            }else {
                blank++;
                print-=2;
            }
            if(blank==0) {
                reverse=1;
            }
            System.out.println();
        }
    }
}
