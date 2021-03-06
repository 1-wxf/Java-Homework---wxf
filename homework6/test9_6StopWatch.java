/**
 * @author WXF
 * @data 2021-04-25
 * @description 设计一个名为 StopWatch 的类，编写一个测试程序. 用于测试使用选择排序对 100000个数字进行排序的执行时间
*/

package homework6;
import java.util.Random;
public class test9_6StopWatch {
	public static void main(String[] args) {
		StopWatch watch = new StopWatch();
		Random random = new Random();
		int[] number = new int[100000];
		double startTime;
		double endTime;
		double elapsedTime;

		// 随机生成10w个数字
		for (int i = 0; i < 100000; i++) {
			number[i] = random.nextInt();
		}

		// 记录选择排序使用时间
		startTime = watch.start();
		for (int i = 0; i < 100000; i++) {
			int min = number[i];
			int index = i;
			for (int j = i + 1; j < 100000; j++) {
				if (min > number[j]) {
					min = number[j];
					index = j; // 记住下标
				}
			}
			// 交换数据
			int temp = number[i];
			number[i] = number[index];
			number[index] = temp;
//			System.out.println(number[i]);
		}
		endTime = watch.stop();
		elapsedTime = watch.getElapsedTime(startTime, endTime);
		System.out.println(elapsedTime);

	}

}

class StopWatch {

	private double startTime;
	private double endTime;

	double start() {
		this.startTime = System.currentTimeMillis();
		return this.startTime;
	}

	double stop() {
		this.endTime = System.currentTimeMillis();
		return this.endTime;
	}

	double getElapsedTime(double startTime, double endTime) {
		return endTime - startTime;
	}

}

	