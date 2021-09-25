package review;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepositException extends BankAccountException {

	public DepositException(String message, int errorCode) {
		super(message, errorCode);
		// TODO Auto-generated constructor stub
	}
	

}
