package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println("Eleman Sayısı:" + mesaj.length());
		System.out.println("5.Eleman:" + mesaj.charAt(7));
		System.out.println(mesaj.concat(" Yaşasın!.."));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("n"));
		
		char[] karakterler=new char[10];
		mesaj.getChars(2, 8, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("a"));
		
		System.out.println(mesaj.replace('.', '!'));
		System.out.println(mesaj.substring(3,8));
		
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());
	}

}
