package Sekil;

public class Daire extends Sekil {

	private int yaricap;
	
	public Daire(String isim,int yaricap) {
		super(isim);
		this.yaricap=yaricap;
	}

	@Override
	void alan_hesapla() {
		if (yaricap>0) {
			
		
		System.out.println(getIsim()+"nin Alaný= "+(Math.PI*yaricap*yaricap));	
		}
		else {
			System.out.println("Yarýçap Ölçüsü Geçersizdir..");
		}
	}

	@Override
	void cevre_hesapla() {
		if(yaricap>0) {
		System.out.println(getIsim()+"nin Çevresi= "+(Math.PI*2*yaricap));	
		}
		else {
			System.out.println("!!!!  Uzunluk Ölçüsü Negatif veya sýfýr olamaz  !!!!");
		}

	}
	
	

}
