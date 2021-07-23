package Sekil;

public abstract class Sekil {
	private String isim;

	public Sekil(String isim) {
		super();
		this.isim = isim;
	}
	
	//govdeli (somut) Metod
	public void ismini_soyle() {
		
		System.out.println("Bu Obje "+ isim +" objesidir.");
	}
	
	// Abstract (soyut,govdesiz)Metod
	abstract void alan_hesapla();
	abstract void cevre_hesapla();
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	
	

}
