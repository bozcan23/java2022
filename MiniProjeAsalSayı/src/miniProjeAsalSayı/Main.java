package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {
		int sayi = 23;
		boolean isPrime = true;
		if(sayi<2) {
			System.out.println("Geçersiz sayı");
			return;
		}
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			System.out.println("Sayı asaldır");
		} else {
			System.out.println("Sayı asal değil");

		}
	}
}
