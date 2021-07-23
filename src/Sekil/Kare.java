package Sekil;

public class Kare extends Sekil{
	private int kenar;

	
	public Kare(String isim,int kenar) {
		super(isim);
		this.kenar=kenar;
	}


	@Override
	void alan_hesapla() {
		System.out.println(getIsim()+"nin Alanı= "+(kenar*kenar));

	}

	@Override
	void cevre_hesapla() {
		System.out.println(getIsim()+"nin Çevresi= "+(4*kenar));
	}
	
	

}
