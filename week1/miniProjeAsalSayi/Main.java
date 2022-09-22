public class Main {
    public static void main(String[] args) {
		int number = 23;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;

		if(number==1){
			System.out.println("Sayi asal degildir");
			return;
		}

		if(number<2){
			System.out.println("Gecersiz sayi girildi");
		}

		for(int i=2;i<number;i++){
			if(number % i ==0){
				isPrime = false;

			}
			if(isPrime==true){
				System.out.println("Sayi asaldir");
				break;
			}
			else{
				System.out.println("Sayi asal degildir");
				break;
			}

		}


	}


}