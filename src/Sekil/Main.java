package Sekil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Kare kare1=new Kare();
		Daire daire1=new Daire();
		Diktorgen diktorgen1=new Diktorgen();
		Ucgen ucgen1=new Ucgen();*/
		
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("**********Geometrik Sekillerin Cevre ve Alan Hesab�**********\n");
		String shape ="Kare i�in 1 \n"+
					  "Dikdortgen i�in 2 \n"+
				      "��gen i�in 3 \n"+
					  "Daire i�in 4 \n"+
				      "��k�� i�in 5'e \n"+
					  "Bas�n�z";
		System.out.println(shape);
		while(true) {
			System.out.print("\nL�tfen geometrik seklinizi se�iniz: ");
			int secenek=scanner.nextInt();
			
			if(secenek==5) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			}
			else if (secenek==1) {
				
				System.out.print("Karenin kenar�n� giriniz: ");
				int kenar=scanner.nextInt();
				Kare kare1=new Kare("Kare",kenar);
				
				kare1.alan_hesapla();
				kare1.cevre_hesapla();
				
			}
			else if (secenek==2) {
				
				System.out.print("Birinci Kenar: ");
				int kenar1=scanner.nextInt();
				
				System.out.print("�kinci Kenar: ");
				int kenar2=scanner.nextInt();
				
				
				Diktorgen diktorgen=new Diktorgen("Dikd�rgen", kenar1, kenar2);
				diktorgen.alan_hesapla();
				diktorgen.cevre_hesapla();
				}
			
			else if (secenek==3) {
				System.out.print("Birinci Kenar: ");
				int kenar1=scanner.nextInt();
				
				System.out.print("�kinci Kenar: ");
				int kenar2=scanner.nextInt();
				
				System.out.print("���nc� Kenar: ");
				int kenar3=scanner.nextInt();
				
				Ucgen ucgen=new Ucgen("��gen", kenar1, kenar2, kenar3);
				
				ucgen.alan_hesapla();
				ucgen.cevre_hesapla();
			}
			
			else if (secenek==4) {
				System.out.print("Yar��ap: ");
				int yaricap=scanner.nextInt();
				
				Daire daire=new Daire("Daire", yaricap);
				
				daire.alan_hesapla();
				daire.cevre_hesapla();
				
			}
			
			else {
				System.out.println("Ge�ersiz Bir ��lem Girildi.. Tekrar Deneyiniz");
			}
			
	}
	}
}
