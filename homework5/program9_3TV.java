/**
 * @author WXF
 * @data 2021-04-19
 * @description 定义 TV 类的程序，TV 类中的构造方法和其他方法定义为公共的，因此可以从其他类中访问。
*/
package homework5;

public class program9_3TV {

	public static void main(String[] args) {
		
	}
		int channel = 1;// Default channel is 1
	    int volumelevel = 1;// Default volumn level is 1
	    boolean on = false;// TV is off
	    
	    public program9_3TV() {
	    }

	    public void turnOn() {
	        on = true;
	    }

	    public void turnOff() {
	        on = false;
	    }

	    public void setChannel(int newChannel) {
	        if(on && newChannel >= 1 && newChannel <= 120)
	        {
	            channel = newChannel;
	        }
	    }

	    public void setVolumelevel(int newVolumeLevel) {
	        if(on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
	            volumelevel = newVolumeLevel;
	    }

	    public void channelUP() {
	        if(on && channel < 120)
	            channel++;
	    }

	    public void volumeUp() {
	        if(on && volumelevel < 7)
	            volumelevel++;
	    }

	    public void volumeDown() {
	        if(on && volumelevel > 1)
	            volumelevel--;
	    }
}

	
	

