package review;



class singletonEx{
	
	private static singletonEx single;
    private int num;
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	private singletonEx() {
	     num = 6;
	}
	
	
	public static singletonEx getSingle() {
		if(single == null)
			single = new singletonEx();
		
		return single;
	}

	public static void setSingle(singletonEx single) {
		singletonEx.single = single;
	}
	

	
}


public class Singleton {

	public static void main(String[] args) {
		
		
		singletonEx ex = singletonEx.getSingle();
		singletonEx ex1 = singletonEx.getSingle();
		singletonEx ex2 = singletonEx.getSingle();
		
		System.out.println(ex);
		System.out.println(ex1);
		System.out.println(ex2.getNum());
		
		ex.setNum(7);
		System.out.println(ex.getNum());
		System.out.println(ex1.getNum());
		System.out.println(ex2.getNum());
		
		ex.setNum(0);
		System.out.println(ex.getNum());
		System.out.println(ex1.getNum());
		System.out.println(ex2.getNum());
		
	}

}
