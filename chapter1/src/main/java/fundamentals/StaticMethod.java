package fundamentals;

/**
 * @Author ZhangGJ
 * @Date 2020/04/09 22:44
 */
public class StaticMethod {

    /**
     * 计算整数的绝对值
     *
     * @param x
     * @return
     */
    public static int absoluteValueInt(int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    /**
     * 计算浮点数的绝对值
     *
     * @param x
     * @return
     */
    public static double absoluteValueDouble(double x) {
        if (x < 0.0) {
            return -x;
        }
        return x;
    }

    /**
     * 判断一个数是否是质数
     *
     * @param x
     * @return
     */
    public static boolean isPrimeNumber(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(9));
    }
}
