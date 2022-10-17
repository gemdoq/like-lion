package week6.day1.algorithm;

public class IncreasingTower {
    String s = "";
    public IncreasingTower(String s) {
        this.s = s;
    }

    public void print(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
