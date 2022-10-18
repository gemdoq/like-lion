package week6.day2.algorithm;

public class RecursiveStarTower {
    public void print(int maxNum, int currentNum) {
        if (currentNum > maxNum) { return; }
        System.out.print("*".repeat(currentNum));
        System.out.println();
        currentNum = currentNum +1;
        print(maxNum, currentNum);
    }
}
