package fundamentals;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author ZhangGJ
 * @Date 2020/04/02 23:29
 */
public class TypicalArray {

    int[] a = new int[10];

    /**
     * 初始化数组
     * @param a
     * @return
     */
    public int[] initArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        return a;
    }

    /**
     * 找出数组中最大的元素
     * @return
     */
    public int maxElement() {
        initArray(a);
        System.out.println(Arrays.toString(a));
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max: " + max);
        return max;
    }

    public static void main(String[] args) {
        new TypicalArray().maxElement();
    }
}
