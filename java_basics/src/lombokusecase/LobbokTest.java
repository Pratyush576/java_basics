package lombokusecase;

import lombok.extern.java.Log;

@Log
public class LobbokTest {
	public static void main(String[] args) {
		UserInfo ui = new UserInfo(10);
		ui.setFirstName("Pratyush");
		ui.setLastName("Kumar");
		ui.setId(123456L);
		ui.setAbout("this is test class");
		log.info(ui.getFirstName()+" "+ui.getLastName()+" "+ui.getId()+" "+ui.getAbout());
		log.info(ui.toString());
	}
}
