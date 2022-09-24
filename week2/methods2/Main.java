public class Main {
	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel";
		String yenimesaj = isimVer();
		System.out.println(yenimesaj);
		int sayi = topla(5,6);
		System.out.println(sayi);
		int toplam = toplam(4,5,6,7,8,10,20);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");

	}

	public static void sil() {

		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Guncellendi");

	}

	public static int topla(int sayi1, int sayi2){
		return sayi1+sayi2;
		

	}

	public static int toplam(int... sayilar){
		int toplam=0;
		for(int sayi:sayilar){
			toplam+=sayi;
		}
		return toplam;

	}

	public static String isimVer(){
		return "Eren";
	}

}
