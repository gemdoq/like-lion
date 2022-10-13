package week5.day3.algorithm;
//  static method는 main말고는 쓰지마세요.
//  int형 array를 return하고 int형 array를 받는 sort() 메소드를 만드세요

public class lesson1 {
    public int[] sort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};

        lesson1 ls1 = new lesson1();
        ls1.sort(arr);
    }
}
