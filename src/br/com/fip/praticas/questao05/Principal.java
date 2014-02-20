package br.com.fip.praticas.questao05;

public class Principal {

	public static Circulo circulo;
	public static Retangulo retangulo;
	
	public static void main(String[] args) {
			
		circulo.setRaio(20);
		System.out.println(circulo.getPerimetro());
		circulo.toString();
		
		//retangulo
		retangulo.setBase(20);
		retangulo.setAltura(40);
		retangulo.toString();

	}
	
	

}
