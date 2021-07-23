package Sekil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Kare kare1=new Kare();
		Daire daire1=new Daire();
		Diktorgen diktorgen1=new Diktorgen();
		Ucgen ucgen1=new Ucgen();*/
		
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("**********Geometrik Sekillerin Cevre ve Alan Hesabý**********\n");
		String shape ="Kare için 1 \n"+
					  "Dikdortgen için 2 \n"+
				      "Üçgen için 3 \n"+
					  "Daire için 4 \n"+
				      "Çýkýþ için 5'e \n"+
					  "Basýnýz";
		System.out.println(shape);
		while(true) {
			System.out.print("\nLütfen geometrik seklinizi seçiniz: ");
			int secenek=scanner.nextInt();
			
			if(secenek==5) {
				System.out.println("Programdan Çýkýlýyor...");
				break;
			}
			else if (secenek==1) {
				
				System.out.print("Karenin kenarýný giriniz: ");
				int kenar=scanner.nextInt();
				Kare kare1=new Kare("Kare",kenar);
				
				kare1.alan_hesapla();
				kare1.cevre_hesapla();
				
			}
			else if (secenek==2) {
				
				System.out.print("Birinci Kenar: ");
				int kenar1=scanner.nextInt();
				
				System.out.print("Ýkinci Kenar: ");
				int kenar2=scanner.nextInt();
				
				
				Diktorgen diktorgen=new Diktorgen("Dikdörgen", kenar1, kenar2);
				diktorgen.alan_hesapla();
				diktorgen.cevre_hesapla();
				}
			
			else if (secenek==3) {
				System.out.print("Birinci Kenar: ");
				int kenar1=scanner.nextInt();
				
				System.out.print("Ýkinci Kenar: ");
				int kenar2=scanner.nextInt();
				
				System.out.print("Üçüncü Kenar: ");
				int kenar3=scanner.nextInt();
				
				Ucgen ucgen=new Ucgen("Üçgen", kenar1, kenar2, kenar3);
				
				ucgen.alan_hesapla();
				ucgen.cevre_hesapla();
			}
			
			else if (secenek==4) {
				System.out.print("Yarýçap: ");
				int yaricap=scanner.nextInt();
				
				Daire daire=new Daire("Daire", yaricap);
				
				daire.alan_hesapla();
				daire.cevre_hesapla();
				
			}
			
			else {
				System.out.println("Geçersiz Bir Ýþlem Girildi.. Tekrar Deneyiniz");
			}
			
	}
	}
}
