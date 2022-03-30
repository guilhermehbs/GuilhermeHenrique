package desafio1;

import java.io.IOException;
import java.util.ArrayList;

public abstract class CalculoMedia {
	
	private static int contador = 0;
	private static float soma = 0;
	private static float media;
	private static float totalDeNumeros;
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> list = Entrada.main(args);
		
		//list.stream().forEach(System.out::println);
			
		for (float lista : list) {
			contador++;
			totalDeNumeros = contador;
		}
		
		for (int i = 0; i < list.size(); i++) {
			soma += list.get(i);
		}
		
		setMedia(soma/totalDeNumeros);
		System.out.println("M�dia: " + media);
		
	}

	public static void setContador(int contador) {
		CalculoMedia.contador = contador;
	}

	public static void setSoma(float soma) {
		CalculoMedia.soma = soma;
	}

	public static void setMedia(float media) {
		CalculoMedia.media = media;
	}

	public static void setTotalDeNumeros(float totalDeNumeros) {
		CalculoMedia.totalDeNumeros = totalDeNumeros;
	}

	public static float getSoma() {
		return soma;
	}

	public static float getMedia() {
		return media;
	}

	public static float getTotalDeNumeros() {
		return totalDeNumeros;
	}

	public boolean esreverTexto(String Caminho, String Texto) {
		return false;
	}
	
}
