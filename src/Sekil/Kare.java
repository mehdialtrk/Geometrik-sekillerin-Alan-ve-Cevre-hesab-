package Sekil;

public class Kare extends Sekil{
	private int kenar;

	
	public Kare(String isim,int kenar) {
		super(isim);
		this.kenar=kenar;
	}


	@Override
	void alan_hesapla() {
		System.out.println(getIsim()+"nin Alan�= "+(kenar*kenar));

	}

	@Override
	void cevre_hesapla() {
		System.out.println(getIsim()+"nin �evresi= "+(4*kenar));
	}
	
	

}
