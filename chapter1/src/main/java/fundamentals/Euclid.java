package fundamentals;

/**
 * 欧几里得算法
 *
 * @Author ZhangGJ
 * @Date 2020/01/08 23:06
 */
public class Euclid {

    public static int euclid (int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return euclid(q, r);
    }

    public static void main(String[] args) {
        System.out.println(euclid(60, 12));
    }

}
