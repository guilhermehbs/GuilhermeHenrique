package desafio1;

import java.util.ArrayList;

public abstract class CalculoMedia {
	
	private int contador = 0;
	private int soma = 0;
	private float media;
	private int totalDeNumeros;
	
	public static void main(String[] args) {
		
		//teste
			
		for (float lista : list) {
			contador++;
			totalDeNumeros = contador;
		}
		
		System.out.println("Contador: " + contador);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Número:" + list.get(i));
			soma += list.get(i);
		}
		
		media = soma/totalDeNumeros;
	}
	public static int getSoma() {
		return soma;
	}

	public static float getMedia() {
		return media;
	}

	public static int getTotalDeNumeros() {
		return totalDeNumeros;
	}
}
