package review_lombok_excetion_oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor   //lombok을 이용해 코드 불러오기!
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Staff {
	private long StaffNo;
	private String name;
	private String dept;
}
