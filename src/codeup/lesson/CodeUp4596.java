package codeup.lesson;

public class CodeUp4596 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {113,23,85,34,17,74,25,52,65},
                {10,7,39,42,88,52,14,72,63},
                {87,42,18,78,53,45,18,84,53},
                {34,28,64,85,12,16,75,36,55},
                {21,77,45,35,28,75,90,76,1},
                {25,87,65,15,28,11,37,28,74},
                {65,27,75,41,7,89,78,64,39},
                {47,47,70,45,23,65,3,41,44},
                {87,13,82,38,31,12,29,29,80},
        };
        // 순회를 돌아야 함 9 * 9
        int maxValue = arr[0][0];
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                // j가 0~9까지 한번 돌면 i가 1씩 올라감
                if(arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println(maxValue);
    }
}
