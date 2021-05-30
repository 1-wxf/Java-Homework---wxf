/**
 * @author WXF
 * @data 2021-03-22
 * @description编写程序，模拟从一副 S2 张的牌中选择一张牌。程序应该显示牌的大小( Ace、2、3、4、5、6、7、8、9、10、Jack、Queen、King) 以及牌的花色（Clubs (黑梅花)、Diamonds (红方块)、Hearts (红心)、Spades (黑桃))。
*/


package homework3;
import java.util.Random;

public class test3_24 {

	public static void main(String[] args) {
		String[] number = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		String[] color = { "Clubs", "Diamonds", "Hearts", "Spades" };
		Random random = new Random();
		System.out.println(
				String.format("The card you picked is %s of %s", number[random.nextInt(13)], color[random.nextInt(4)]));

	}

}
