package chapter5;

public class Ex5_09 {

	public static void main(String[] args) {
        char[][] ch = {
        		{'*', '*', ' ', ' ',' '},
        		{'*', '*', ' ', ' ',' '},
             	{'*', '*', '*', '*', '*'},
            	{'*', '*', '*',  '*','*'}
            	
	         };
        
        char[][] result = new char[ch[0].length] [ch.length];

        for(int i=0; i<ch.length; i++) {
        	for(int j =0; j<ch[i].length; j++) {
        		System.out.print(ch[i][j]);
        	}
        	System.out.println();
        	
        }
        
    	System.out.println();
            for(int i=0; i<ch.length; i++) {
            	for(int j =0; j<ch[i].length; j++) {
            	int x = j;
            	int y = ch.length-1-i;
            	
            	result[x][y] = ch[i][j];
            	} 	
    }
        
        for(int i =0; i<result.length; i++) {
        	for(int j =0; j<result[i].length; j++) {
        		System.out.print(result[i][j]);
        	}
        	System.out.println();
        }
        
   }
}