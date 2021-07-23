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
			
		
		System.out.println(getIsim()+"nin Alan�= "+(Math.PI*yaricap*yaricap));	
		}
		else {
			System.out.println("Yar��ap �l��s� Ge�ersizdir..");
		}
	}

	@Override
	void cevre_hesapla() {
		if(yaricap>0) {
		System.out.println(getIsim()+"nin �evresi= "+(Math.PI*2*yaricap));	
		}
		else {
			System.out.println("!!!!  Uzunluk �l��s� Negatif veya s�f�r olamaz  !!!!");
		}

	}
	
	

}
