package ch15;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IOEx41_Serial2 {

	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
		    BufferedInputStream bos = new BufferedInputStream(new FileInputStream(fileName));
		    
		    ObjectInputStream in =new ObjectInputStream(bos);
		    
		    // 객체 직렬화 ->역직렬화하여 보여주기 
		    UserInfo u1 = (UserInfo)in.readObject();
		    UserInfo u2 = (UserInfo)in.readObject();
		    ArrayList list = ( ArrayList)in.readObject();
		   
		    System.out.println(u1);
		    System.out.println(u2);
		    System.out.println(list);
		  
		   
		    System.out.println("역직렬화 끝 ");
		} catch(Exception e) {}

	}

}
