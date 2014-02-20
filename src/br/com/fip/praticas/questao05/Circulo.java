package br.com.fip.praticas.questao05;

public class Circulo implements FormaGeometrica {
	
	private final double PI = 3.14159265359;
	private double raio;
	
	public double getArea (){
		return PI* raio * raio;
	}
	
	public double getPerimetro (){
		return 2 * PI * raio;
	}
	
	public void desenhar () {
		System.out.println("CIRCULO");
	}
	
	public double getRaio () {
		return raio;
	}
	
	public void setRaio (double raio) {
		this.raio = raio;
	}
	
	public String toString() {
		return "PI =" + PI + ", RAIO =" + ", AREA TOTAL" + getArea();
	}

}
