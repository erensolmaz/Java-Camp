public class Main {
    public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel Bugun";

		System.out.println(mesaj);

		/*
		System.out.println("Eleman sayısı" +mesaj.length());//mesajın uzunluğunu yazdırır
		System.out.println("5. eleman:"+mesaj.charAt(4));//elemanın harfini gosterir
		System.out.println(mesaj.concat(" Yaşasın"));//cümlenin sonuna ekler
		System.out.println(mesaj.startsWith("B"));//cümle yazılan kelime ile başlarsa true başlamazsa false yazdırır
		System.out.println(mesaj.endsWith("c"));//sonu bitiyorsa true bitmiyorsa false
		System.out.println("-----------");
		char[] karakterler = new char [5];
		mesaj.getChars(0, 5, karakterler, 0);//0 dan 5. karaktere kadar yazdırır.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));//****aranan kelime soldan başlanır ve kaçıncı satırda olduğu yazar
		System.out.println(mesaj.lastIndexOf("guz"));//****aranan kelime sagdan başlanır ve kaçıncı satırda olduğu yazar
		*/

		//System.out.println(mesaj.replace("Bugun", "yarın")); //yazılan kelimeleri replace ettirir
		String yeniMesaj = mesaj.replace("Bugun", "yarın");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(3, 8)); // kesme komutu aradaki kelimeleri verir

		for(String kelime : mesaj.split(" ")){
			System.out.println(kelime); //boşluklu yerleri alt alta sıralar

		}

		System.out.println(mesaj.toLowerCase());//kelimeleri küçük yazdırır
		System.out.println(mesaj.toUpperCase());//kelimeleri büyük yazdırır
		System.out.println(mesaj.trim());//başında ve sonundaki boşlukları kaldırır daha temiz goruntu sağlar


	

	}


}