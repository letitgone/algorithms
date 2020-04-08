package fundamentals;


/**
 * 二维数组（矩阵）
 *
 * @Author ZhangGJ
 * @Date 2020/04/08 22:52
 */
public class TwoDimensionalMatrix {

    public static void main(String[] args) {
        double[][] b = new double[3][4];
        System.out.println(b.length);
        System.out.println(b);

        double[][] b1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(b1[2][3]);
        System.out.println(b1.length);
    }
}
