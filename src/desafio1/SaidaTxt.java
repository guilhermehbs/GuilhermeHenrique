
package desafio1;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

	public class SaidaTxt extends CalculoMedia implements EscreverArquivos {

		@Override
		public void ecreverValor() {
			float mediaTxt = getSoma()/getTotalDeNumeros();
		}
		
		public static void main(String[] args) throws IOException {
			
			ArrayList<Integer> list = Entrada.main(args);
			
			FileWriter arquivo = new FileWriter("c:\\desafio1\\Saida.txt");
		    PrintWriter gravarArquivo = new PrintWriter(arquivo);
		    
		    gravarArquivo.printf("N�meros digitados: " + list);
	
		    media = soma/totalDeNumeros;
			gravarArquivo.printf("M�dia: " + media);
		    
			System.out.println("M�dia: " + media);
		    System.out.println("Arquivo TXT salvo em: c:\\\\desafio1\\\\Saida.txt ");
		    
		    arquivo.close();
		}	   
}
