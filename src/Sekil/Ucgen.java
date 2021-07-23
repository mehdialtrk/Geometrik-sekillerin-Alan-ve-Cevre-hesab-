package Sekil;

public class Ucgen extends Sekil{
	
	private double a;
	private double b;
	private double c;
	
	
	
	public Ucgen(String isim,double a,double b,double c) {
		super(isim);
		this.a=a;
		this.b=b;
		this.c=c;
	}

	@Override
	 void alan_hesapla() {
		double u;
		u=(a+b+c)/2.0;
		if((u-a)<=0 || (u-b)<=0 || (u-c)<=0) {
		System.out.println("Boyle bir ��genin olmasi m�mk�n de�ildir"
				+"\nBakiniz: ��gende A��-Kenar Ba�lant�lar�");
		}

		else {
			System.out.println(getIsim()+"in Alan�= "+ Math.sqrt((u*(u-a)*(u-b)*(u-c))));
		}
		
	}

	@Override
	void cevre_hesapla() {
		double u;
		u=(a+b+c)/2.0;
		if((u-a)<=0 || (u-b)<=0 || (u-c)<=0) {
		System.out.println(" !!!!  Ayr�ca Uzunluk �l��s� Negatif veya s�f�r olamaz  !!!! ");
		}
		else {
			System.out.println(getIsim()+"in �evresi= "+(a+b+c));
		}
		
		
	}

}
