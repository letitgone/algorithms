package fundamentals;

import java.util.Arrays;

/**
 * @Author ZhangGJ
 * @Date 2020/04/02 23:29
 */
public class TypicalArray {

    public static double[] initArray(int length) {
        double[] arr = new double[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(1 + Math.random() * 100);
        }
        return arr;
    }

    /**
     * 找到数组中最大的数
     *
     * @param arr
     * @return
     */
    public static double findMaxValue(double[] arr) {
        System.out.println("Original array: " + Arrays.toString(arr));
        double maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    /**
     * 求数组平均值
     *
     * @param arr
     * @return
     */
    public static double calculateAverageValue(double[] arr) {
        System.out.println("Original array: " + Arrays.toString(arr));
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }


    /**
     * 复制数组
     *
     * @param arr
     * @return
     */
    public static double[] copyArray(double[] arr) {
        System.out.println("Original array: " + Arrays.toString(arr));
        double[] copyArray = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArray[i] = arr[i];
        }
        return copyArray;
    }

    /**
     * 颠倒顺序
     *
     * @param arr
     * @return
     */
    public static double[] reverseOrder(double[] arr) {
        System.out.println("Original array: " + Arrays.toString(arr));
        double[] reverseArray = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = reverseArray.length - 1; j > 0; j--) {
                reverseArray[j] = arr[i];
                continue;
            }
        }
        return reverseArray;
    }

    public static void main(String[] args) {
        System.out.println(findMaxValue(initArray(10)));
        System.out.println(calculateAverageValue(initArray(10)));
        System.out.println(Arrays.toString(copyArray(initArray(10))));
        System.out.println(Arrays.toString(reverseOrder(initArray(10))));
    }
}
