package week6.day1.algorithm;

public class StarPrinter {
    public static void main(String[] args) {
        IncreasingTower increasingTower = new IncreasingTower("s");
        increasingTower.print(3);

        increasingTower.setS("x");
        increasingTower.print(5);
    }
}