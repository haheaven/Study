package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IOEx40_Serial {

	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileOutputStream  fos = new FileOutputStream(fileName);
		    BufferedOutputStream bos = new BufferedOutputStream(fos);
		    
		    ObjectOutputStream out =new ObjectOutputStream(bos);
		    
		    UserInfo u1 = new UserInfo("JavaWoman", "1234", 20);
		    UserInfo u2 = new UserInfo("Javaman", "1111", 20);
		    
		    ArrayList<UserInfo> list = new ArrayList<>();
		    list.add(u1);
		    list.add(u2);
		    
		    // 객체 직렬화!
		    out.writeObject(u1);
		    out.writeObject(u2);
		    out.writeObject(list);
		    out.close();
		    System.out.println("직렬화 끝 ");
		} catch(Exception e) {}

	}

}
