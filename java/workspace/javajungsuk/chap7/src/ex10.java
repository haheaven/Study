package chap7;
// 10. MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고 
//대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하라.

class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0; 
	final int MAX_CHANNEL = 100; 
	final int MIN_CHANNEL = 1;
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel>MAX_CHANNEL || channel <MIN_CHANNEL)
			return;
		this.channel = channel;
		
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME || volume <MIN_VOLUME)
			return;
		this.volume = volume;
	}
}
	// 매개변수가 있어서 넘겨받는 메서드들엔 유효성 검사를 잊지말자 

	


public class ex10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel()); 
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
	}

}
