package arraysDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[5];
		ogrenciler[0] = "Kubilay";
		ogrenciler[1] = "Gönül";
		ogrenciler[2] = "Şevval";
		ogrenciler[3] = "Hazar";
		ogrenciler[4] = "Masal";

		for (String ogr : ogrenciler) {
			System.out.println(ogr);
		}
		
		System.out.println("--------------------------");
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
	}

}
