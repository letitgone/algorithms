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
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArray[j] = arr[i];
            j++;
        }
        return reverseArray;
    }

    /**
     * 颠倒顺序2
     *
     * @param arr
     * @return
     */
    public static double[] reverseOrder2(double[] arr) {
        System.out.println("Original array: " + Arrays.toString(arr));
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength / 2; i++) {
            double temp = arr[i];
            arr[i] = arr[arrayLength - 1 - i];
            arr[arrayLength - 1 - i] = temp;
        }
        return arr;
    }

    /**
     * 矩阵相乘（方阵）
     *
     * @return
     */
    public static double[][] matrixMultiplication() {
        double[][] a = new double[3][4];
        double[][] b = new double[3][4];
        int arrayLength = a.length;
        double[][] c = new double[arrayLength][arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                for (int k = 0; k < arrayLength; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(findMaxValue(initArray(10)));
        System.out.println(calculateAverageValue(initArray(10)));
        System.out.println(Arrays.toString(copyArray(initArray(10))));
        System.out.println(Arrays.toString(reverseOrder(initArray(10))));
        System.out.println(Arrays.toString(reverseOrder2(initArray(10))));
    }
}
