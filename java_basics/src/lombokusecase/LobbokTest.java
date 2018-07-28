package lombokusecase;

public class LobbokTest {
	public static void main(String[] args) {
		UserInfo ui = new UserInfo(10);
		ui.setFirstName("Pratyush");
		ui.setLastName("Kumar");
		ui.setId(123456L);
		ui.setAbout("this is test class");
		System.out.println(ui.getFirstName()+" "+ui.getLastName()+" "+ui.getId()+" "+ui.getAbout());
		System.out.println(ui.toString());
	}
}
