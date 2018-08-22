package lombokusecase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

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
