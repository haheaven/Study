package review;

public class UserTest {

	public static void main(String[] args) {
	User user1 = new User("홍길동", "010-111", "서울시 강남구");
	User user2 = new User("둘리", "010-222", "서울시 강남구");
	
    System.out.println(user1);
    System.out.println(user2.toString());
    
    System.out.println("comparison : "+user1.equals(user2));

	}

}
