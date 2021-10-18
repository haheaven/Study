package chap7;
// 11. 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는 
//기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
class MyTv3{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	// 멤버변수추가 
    private int previous_channel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0; 
	final int MAX_CHANNEL = 100; 
	final int MIN_CHANNEL = 1;
	
	//gotoPrevChannel 
	void gotoPrevChannel() {
		setChannel(previous_channel);
	}
	
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
		
		previous_channel = this.channel;  //현재 채널을 이전 채널에 저장하고 설정한 채널로 변경한다.
												// 반대로 적는 경우는 바뀐 채널이 설정되는 
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

public class ex11 {
	public static void main(String[] args) {
		MyTv3 t = new MyTv3();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel()); 
		t.setChannel(20); 
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel()); 
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}

}
