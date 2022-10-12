package codeup.lesson;

public class CodeUp2081 {
    public int getMax(int[] arr) {
        // loop 구성
        int maxValue = arr[0]; // arr이 모두 음수인 경우 0으로 하면 0이 max
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        CodeUp2081 codeUp2081 = new CodeUp2081();
        int result = codeUp2081.getMax(arr);
        if(result == 85) {
            System.out.println("test pass");
        } else {
            System.out.println("test fail");
        }
    }
}
