package Sekil;

public class Diktorgen extends Sekil {
	
	private int k�sa_kenar;
	private int uzun_kenar;
	
	public Diktorgen(String isim,int k�sa_kenar,int uzun_kenar) {
		super(isim);
		this.k�sa_kenar=k�sa_kenar;
		this.uzun_kenar=uzun_kenar;
	}

	@Override
	void alan_hesapla() {
		System.out.println(getIsim()+"in Alan�= "+(uzun_kenar*k�sa_kenar));

	}

	@Override
	void cevre_hesapla() {
		System.out.println(getIsim()+"in �evresi= "+(2*(k�sa_kenar+uzun_kenar)));

	}

}
