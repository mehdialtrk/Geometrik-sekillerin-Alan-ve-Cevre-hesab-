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
		System.out.println("Boyle bir üçgenin olmasi mümkün deðildir"
				+"\nBakiniz: Üçgende Açý-Kenar Baðlantýlarý");
		}

		else {
			System.out.println(getIsim()+"in Alaný= "+ Math.sqrt((u*(u-a)*(u-b)*(u-c))));
		}
		
	}

	@Override
	void cevre_hesapla() {
		double u;
		u=(a+b+c)/2.0;
		if((u-a)<=0 || (u-b)<=0 || (u-c)<=0) {
		System.out.println(" !!!!  Ayrýca Uzunluk Ölçüsü Negatif veya sýfýr olamaz  !!!! ");
		}
		else {
			System.out.println(getIsim()+"in Çevresi= "+(a+b+c));
		}
		
		
	}

}
