package chapter6;
import java.util.*;
public class Ex06 {

	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((double)(x1-x)*(x1-x) + (double)(y1-y)*(y1-y));
	}
	   

public static void main(String[] args) {
	System.out.println(getDistance(1,1,2,2));
   }
}