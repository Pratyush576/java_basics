package javaSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class studentInfo implements Serializable {
	String name;
	int rid;
	static String contact;

	studentInfo(String n, int r, String c) {
		this.name = n;
		this.rid = r;
		this.contact = c;
	}

	public static void main(String[] args) {
		try {
			studentInfo si = new studentInfo("Abhi", 104, "110044");
			studentInfo si2 = new studentInfo("AbhiKU", 104, "110044");
			FileOutputStream fos = new FileOutputStream("/tmp/student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			oos.writeObject(si2);
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



//NOTE: Contact field is null because,it was marked as static and as we have discussed earlier static fields does not get serialized.
