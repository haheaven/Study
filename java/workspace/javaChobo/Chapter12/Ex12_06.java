package Chapter12;

//     
enum Direction2 {
	EAST(1, ">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
    
	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int num;
	private final String symbol;
	
	Direction2(int num, String symbol){
		this.num = num;
		this.symbol = symbol;
	}

	
	public int getNum() { return num; }
	public String getSymbol() { return symbol; }

    public static Direction2 of(int dir) {
    	if(dir < 1 || dir > 4) {
    		throw new IllegalArgumentException("Invalid value : "+dir);
    	}
    	return DIR_ARR[dir - 1];
    }
    
    public Direction2 rotate(int n) {
    	n =n%4;
    	
    	if(n<0) n+=4;
    	return DIR_ARR[(num-1+n) %4];
    	
    }
    public String toString() {
    	return name()+getSymbol();
    }
 }

class Ex12_06 {
 public static void main(String[] args) {

	  for(Direction2 d : Direction2.values())
		    System.out.printf("%S=%d%n", d.name(), d.getNum());
	  
	  Direction2 d1 = Direction2.EAST;
	  Direction2 d2 = Direction2.of(1);
	
	  
	  System.out.printf("d1=%s, %d%n", d1.name(), d1.getNum());
	  System.out.printf("d2=%s, %d%n", d2.name(), d2.getNum());
	  
	  
	  System.out.println(Direction2.EAST.rotate(1));
	  System.out.println(Direction2.EAST.rotate(-1));
	  System.out.println(Direction2.WEST.rotate(1));
	  System.out.println(Direction2.NORTH.rotate(2));



     }
 }