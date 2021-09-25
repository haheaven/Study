package review;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class BankAccountException extends Exception{
//	private String message;  //부모인 Exception이 가지고 있기 때문에 자식클래스의 String message를 필드에 적을필요가 없다.
	private int errorCode;
	
	public BankAccountException(String message, int errorCode) {
		super(message);
		this.errorCode =errorCode;
	}

}
