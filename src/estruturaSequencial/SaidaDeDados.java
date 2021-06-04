package estruturaSequencial;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		/*
		 * PARA ESCREVER NA TELA UM TEXTO QUALQUER:
		 * 
		 * SEM QUEBRA DE LINHA NO FINAL:
		 * System.out.print("texto");
		 * 
		 * COM QUEBRA DE LINHA NO FINAL:
		 * System.out.println("texto");
		 * 
		 * PARA ESCREVER O CONTEUDO DE UMA VARIAVEL DE PONTO FLUTUANTE:
		 * System.out.printf("%.2f%n",variavel double ou float); - escreve a variavel com 2 casas depois da 			virgula e quebra linha no final.
		 * 
		 * PARA CONCIDERAR O SEPARADOR DECIMAL COMO PONTO:
		 * Locale.setDefault(Locale.US); - antes da declaração do Scanner
		 * 
		 * PARA CONCATENAR VARIOS ELEMENTOS EM UM MESMO COMANDO DE ESCRITA:
		 * String nome = 'Maria';
		 * int idade = 31;
		 * double renda = 4000.0;
		 * System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		 * 
		 * MARCADORES:
		 * %f - ponto flutuante
		 * %d - inteiro
		 * %s - string
		 * %n - quebra de linha
		 * %c - char
		 */
		
		
		//EXERCICIO DE FIXAÇÃO:
		
		String product1 = "Computer",product2 = "Office Desk";
		int age = 30 , code = 5290;
		char gender = 'F';
		double price1 = 2100.0, price2 = 650.00, measure = 53.234567;
		
		System.out.printf("Products: \n"
				+ "%s, which price is $ %.2f%n"
				+ "%s, which price is $ %.2f%n"
				+ "Record: %d years old, code %d and gender: %c%n"
				+ "Measure whitch eight decimal places: %f%n"
				+ "Rouded (three decimal places): %.3f%n"
				,product1,price1,product2,price2,age,code,gender,measure,measure );
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point %.3f", measure);
		
		

	}

}
