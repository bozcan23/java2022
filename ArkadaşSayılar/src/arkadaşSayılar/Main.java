package arkadaşSayılar;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 1184;
		int toplam1 = 0;
		int sayi2 = 1210;
		int toplam2 = 0;
		for (int i = 1; i < 1184; i++) {
			if (sayi1 % i == 0) {
				toplam1 += i;
			}
		}
		for (int i = 1; i < 1210; i++) {
			if (sayi2 % i == 0) {
				toplam2 += i;
			}
		}
		
		if(sayi1==toplam2 && sayi2==toplam1) {
			System.out.println("Bu iki sayı arkadaştır.");
		}
		else {System.out.println("Bu iki sayı arkadaş değildir.");}

	}
}
