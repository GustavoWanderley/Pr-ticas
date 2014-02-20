package br.com.ffm.praticas.questao06;

public class Contador {
	
	private double valorCont;
	private boolean oper = true;
	
	public Contador () {
		this.valorCont = 0;
	}
	
	public void incrementar() {
		valorCont = valorCont + 1;
		this.oper = false;
	}

	public double getValor() {
		return this.valorCont;
	}

	public void desfazer() {
		if (!oper) {
			this.valorCont = this.valorCont - 1;
			this.oper = true;
		}
		else 
			System.out.println("IGUAL A ZERO");
	}

}
