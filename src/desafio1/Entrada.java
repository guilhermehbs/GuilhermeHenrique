package desafio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
	
	static int list;
	
	public static void main(String[] args) {
		//Declara vari�vel leitura como vazia:
		String leitura = "";
		
		//inicia scanner no console:
		Scanner scan = new Scanner(System.in);
		
		//Criando a lista:
		ArrayList<Integer> list = new ArrayList<>();
		
		//Colocando a quantidade de n�meros que v�o ser digitados:
		System.out.print("Quantos n�meros v�o ser digitados? ");
		int quantidadeDeNumeros = scan.nextInt();
		
		int numeros;
		for(int i=1; i<=quantidadeDeNumeros; i++) {
			
			System.out.print("Digite o " + (i) + "� n�mero: ");
			
			leitura = scan.next();
			
			list.add(Integer.parseInt(leitura));
			
			numeros = Integer.parseInt(leitura);
			if(numeros < 0 && numeros > 10) {
				System.out.println("Digite apenas n�meros entre 0 e 10");

			}
		}
		
		//Imprime os n�meros digitados:
		System.out.println("N�meros digitados: " + list);
		System.out.println("M�dia: " + list);
		scan.close();
	}
		
}

