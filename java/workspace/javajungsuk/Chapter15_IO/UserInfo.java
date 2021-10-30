package ch15;

public class UserInfo implements java.io.Serializable{   // Serializable은 아무것도 없는 인터페이스지만 구현함으로써 직렬화 고려한 클래스임을 알 수 있다!
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String password;
	int age;
	
	public UserInfo() {
		this("Unknow", "1111", 0);  // -> 기본생성자!(UserInfo) 만들면 기본 값 
	}
   public UserInfo(String name, String password, int age) {
	   this.name = name;
	   this.password = password;
	   this.age = age;
   }
   public String toString() {
	   return "("+name+","+password+","+age+")";
   }

}
