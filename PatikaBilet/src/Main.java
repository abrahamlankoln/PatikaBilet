import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mesafe, yas, yolculukTipi;
		double tutar , yeniTutar = 0 ;
		Scanner deger = new Scanner(System.in);
		System.out.print("lutfen yolculuk mesafesini giriniz: ");
		mesafe = deger.nextInt();
		System.out.print("lufen yasinizi giriniz: ");
		yas = deger.nextInt();
		System.out.print("tek yon ise 1\ngidis donus ise 2\nlutfen yolculuk tipini giriniz:\n");
		yolculukTipi = deger.nextInt();
		if (mesafe > 0 && yas > 0 && yolculukTipi <=2 && yolculukTipi > 0) {
			
			tutar = mesafe * 0.10;
			if (yas < 12 && yolculukTipi == 1) {
				yeniTutar = tutar / 2;
				
			}
			if (yas > 12 && yas < 24 && yolculukTipi == 1) {
				yeniTutar = tutar - tutar / 10;
				
			}
			if (yas > 24 && yas < 65 && yolculukTipi == 1) {
				yeniTutar = tutar;
				
			}
			if (yas > 65 && yolculukTipi == 1) {
				yeniTutar = tutar - tutar * 3 / 10;
				
			}
			if (yas < 12 && yolculukTipi == 2) {
				yeniTutar = 2*((tutar / 2) - tutar / 2 * 2 / 10);
				
			}
			if (yas > 12 && yas < 24 && yolculukTipi == 2) {
				yeniTutar = 2*((tutar - tutar / 10) - tutar / 2 * 2 / 10);
			
			}
			if (yas > 24 && yas < 65 && yolculukTipi == 2) {
				yeniTutar =2*(tutar - tutar * 2 / 10);
				
			}
			if (yas > 65 && yolculukTipi == 2) {
				yeniTutar = 2*((tutar - tutar * 3 / 10) - tutar / 2 * 2 / 10);
				
			}
			System.out.println("bilet tutariniz: " + yeniTutar);

		} else {
			System.out.println("hatali giris yaptiniz...tekrar deneyin.");
		}
		
	}

}
