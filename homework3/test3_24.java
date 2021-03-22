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
