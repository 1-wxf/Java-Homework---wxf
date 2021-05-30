/**
 * @author WXF
 * @data 2021-03-29
 * @description 编写一个程序，在一个 4 x 4 的矩阵中随机填入 0 和 1, 打印该矩阵，找到第一个具有最多 1 的行和列
 */
package homework4;
public class test8_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][4];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = (int) (Math.random() * 2);
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		System.out.println("The largest row index:" + max(a, true));
		System.out.println("the largest column index:" + max(a, false));

	}
	private static int max(int[][] array, boolean rowCol) {
		int max;
		int temp = 0, cou = -1;
		for (int i = 0; i < array.length; i++) {
			max = 0;
			for (int j = 0; j < array[i].length; j++) {
				int index = (rowCol) ? array[i][j] : array[j][i];
				if (index == 1)
					max++;
			}
			if (temp < max) {
				temp = max;
				cou = i;
			}
		}
		return cou;
	}
}

