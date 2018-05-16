package com.gft.esempi.ereditarieta;

public class CEO extends Dirigente {

	private String auto;
	private double incentivo;
	
	public CEO(String nome, double stipendio, int anno, int mese, int giorno, double bonus,
			double incentivo, String auto) {
		super(nome, stipendio, anno, mese, giorno, bonus);
		this.auto = auto;
		this.incentivo = incentivo;
	}

	
	
	@Override
	public double getStipendio() {
		// in questo caso il super è Dirigente, quindi ha il bonus
		return super.getStipendio() + incentivo;
	}



	public double getIncentivo() {
		return incentivo;
	}



	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}



	public String getAuto() {
		return auto;
	}

	public void setAuto(String auto) {
		this.auto = auto;
	}
	
	

}
