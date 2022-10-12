package codeup.lesson;
// 시간이 촉박하면 최대값과 최소값을 구하라고 할 때 최대값을 구하는 코드를 만들고
// 부호를 바꿔서 최소값을 구하는 코드로 복사-붙여넣기를 하겠지만,
// 결국 기술 부채를 만드는 것이므로 확장성을 고려한 코드를 작성하려는 고민을 해야 함

// interface작성
interface Compare {
    boolean doSomething(int valueA, int valueB);
}

public class MaxAndMin {
    public int getMaxOrMin(int[] arr, Compare compare) {
        //loop
        int targetValue = arr[0];
        for(int i = 1; i <arr.length; i++) {
            boolean isSth = compare.doSomething(arr[i], targetValue);
            if(isSth) {
                targetValue = arr[i];
            }
        }
        return targetValue;
    }

    public int max(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }
    public int min(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        // test
        int[] arr = new int[]{3, 29, 38, 12};
        MaxAndMin maxAndMin = new MaxAndMin();

        int maxResult = maxAndMin.max(arr);
        int minResult = maxAndMin.min(arr);

        System.out.println(maxResult);
        System.out.println(minResult);
    }
}