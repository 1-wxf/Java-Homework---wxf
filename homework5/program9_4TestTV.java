package homework5;

public class program9_4TestTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program9_3TV tv1 = new program9_3TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolumelevel(3);
		
		program9_3TV tv2 = new program9_3TV();
		tv2.turnOn();
		tv2.channelUP();
		tv2.channelUP();
		tv2.volumeUp();
		
		System.out.println("tv1's channel is " + tv1.channel
		+ " and volumn level is " + tv1.volumelevel);
		System.out.println("tv2's channel is " + tv2.channel
		+ " and volumn level is " + tv2.volumelevel);		
	}

}
