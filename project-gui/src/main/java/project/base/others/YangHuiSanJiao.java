package project.base.others;

/**
 * 打印杨辉三角
 * 
 * @author Liubao
 * @2014年12月2日
 * 
 */
public class YangHuiSanJiao {
    public static void main(String[] args) {

        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            arr[i][i] = 1;
            arr[i][0] = 1;
        }
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 2 * (10 - i) - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
