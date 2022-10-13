package week5.day3.algorithm;
//  static method는 main말고는 쓰지마세요.
//  int형 array를 return하고 int형 array를 받는 sort() 메소드를 만드세요

public class lesson1 {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};

        lesson1 ls1 = new lesson1();
        int[] result = ls1.sort(arr);
        System.out.println(result);
    }
}
