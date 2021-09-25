package review;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class WithdrawalException extends BankAccountException {

	public WithdrawalException(String message, int errorCode) {
		super(message, errorCode);
		// TODO Auto-generated constructor stub
	}
	
	

}
