package lombokusecase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
public class UserInfo {
	private Long id;
	private String firstName;
	private String lastName;
	private String about;
	final private int entryNumber;
}
