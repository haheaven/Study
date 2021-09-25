package review;



class Countdown{
	
	public void countdown(int n) {
		if(n==0){
		   return;		
	}
    System.out.println(n);
    countdown(--n);
	}
}



	

public class recursive {


	public static void main(String[] args) {
		
		Countdown c = new Countdown();
        c.countdown(5);
	}

}


