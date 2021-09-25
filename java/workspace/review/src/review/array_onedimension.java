package review;

public class array_onedimension {

	public static void main(String[] args) {
	
		//윷 놀이
				//"도", 1칸 이동한다.
				//"개", 2칸 이동한다.
				//"걸", 3칸 이동한다.
				//"윷", "걸", 이동한다.
				// 빽도 없음 
				
				            //인덱스를 윷의 이동횟수와 일치하게 함       
		String[] yutnori = {"", "도","개","걸","윷", "모"};
		
		
        int total =0;
        
        
        while(true) {
        	int move = (int)(Math.random()*5)+1;
        	System.out.print(yutnori[move]);
        	total += move;
        	
        	if(move<=3) {
        		System.out.println(", " + total +"칸 이동한다. ");
        	 break;
        	} else {
        		System.out.print(", ");
        	}
        	
        	
        	
        	
        	
        }
		
		
		
		
		
		
	}

}
