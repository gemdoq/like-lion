package week6.day1.algorithm;

public class IncreasingPyramid {
    int num = 0;
    String s = "";

    public IncreasingPyramid(int num, String s) {
        this.num = num;
        this.s = s;
    }

    public void print() {
        String blank = " ";
        String star = s;
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num-i-1; j++) {
                System.out.print(blank);
            }
            for(int k = 0; k < 2*i+1; k++) {
                System.out.print(star);
            }
            for(int j = 0; j < num-i-1; j++) {
                System.out.print(blank);
            }
            System.out.printf("\n");
        }
    }
}
