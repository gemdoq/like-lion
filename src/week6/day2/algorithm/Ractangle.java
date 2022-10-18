package week6.day2.algorithm;

public class Ractangle {
    int heightNum;
    int widthNum;
    String star;

    public Ractangle(int heightNum, int widthNum, String star) {
        this.heightNum = heightNum;
        this.widthNum = widthNum;
        this.star = star;
    }

    public void print() {
        for (int i = 0; i < heightNum; i++) {
            for (int j = 0; j < widthNum; j++) {
                System.out.print(star);
            }
            System.out.printf("\n");
        }
    }
}
