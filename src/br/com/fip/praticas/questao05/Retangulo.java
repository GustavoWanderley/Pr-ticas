package br.com.fip.praticas.questao05;

public class Retangulo implements FormaGeometrica {
	
	private double base;
	private double altura;
	
	public double getArea () {
		return base * altura;
	}
	
	public double getPerimetro () {
		return 2 * (base + altura);
	}
	
	public void desenhar (){
		System.out.println("RETANGULO");
	}
	
	public double getBase (){
		return base;
	}
	
	public void setBase (double base) {
		this.base = base;
	}
	
	public double getAltura () {
		return altura;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return "Base : " + base + ", Altura : " + altura + ", AREA TOTAL : " + getArea();
	}
}
