public class Main {
	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;

			}
		}

		if (varMi) {
			print("Aranan sayi var: "+ aranacak);

		} else {

			print("Aranan sayi yok"+ aranacak);
		}

	}

	public static void print(String mesaj) {
		System.out.println(mesaj);
	}

}
