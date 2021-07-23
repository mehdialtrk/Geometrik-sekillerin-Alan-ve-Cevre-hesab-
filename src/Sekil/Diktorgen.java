package Sekil;

public class Diktorgen extends Sekil {
	
	private int kısa_kenar;
	private int uzun_kenar;
	
	public Diktorgen(String isim,int kısa_kenar,int uzun_kenar) {
		super(isim);
		this.kısa_kenar=kısa_kenar;
		this.uzun_kenar=uzun_kenar;
	}

	@Override
	void alan_hesapla() {
		System.out.println(getIsim()+"in Alanı= "+(uzun_kenar*kısa_kenar));

	}

	@Override
	void cevre_hesapla() {
		System.out.println(getIsim()+"in Çevresi= "+(2*(kısa_kenar+uzun_kenar)));

	}

}
