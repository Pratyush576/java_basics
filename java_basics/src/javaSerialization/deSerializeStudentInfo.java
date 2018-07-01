package javaSerialization;

import java.io.*;


public class deSerializeStudentInfo {
	public static void main(String[] args) {
		studentInfo si = null;
		try {
			FileInputStream fis = new FileInputStream("/tmp/student.txt");
			BufferedInputStream bis= new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			si = (studentInfo) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(si.name);
		System.out.println(si.rid);
		System.out.println(si.contact);
	}
}
