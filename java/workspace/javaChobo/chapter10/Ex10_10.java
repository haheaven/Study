package chapter10;

import java.text.DecimalFormat;
import java.util.Calendar;

public class Ex10_10 {

	public static void main(String[] args) throws Exception {
		double number = 1234567.89;
		String[] pattern = {
				"0",
				"#",
				"#.#",
				"0.0",
				"0000000000.000",
				"#E0",
				"0E0",
				"####E0"
		};
		for(int i =0; i<pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.printf("%19s : %s\n", pattern[i], df.format(number));
		}
		
          
    }
}
