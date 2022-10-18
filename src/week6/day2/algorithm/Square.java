package week6.day2.algorithm;

public class Square {
    private int num = 0;
    private String star = "*";
    public Square(int num, String star) {
        this.num = num;
        this.star = star;
    }
    public void print() {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(star);
            }
            System.out.printf("\n");
        }
    }
}
