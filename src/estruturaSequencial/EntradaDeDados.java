package estruturaSequencial;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		/*
		 * Scanner
		 * 
		 * Para fazer entrada de dados, nos vamos ter que criar um objeto do tipo Scanner da seguinte forma:
		 */
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * import java.util.Scanner;
		 * faça o sc.close() quando não precisar mais do objeto sc
		 * 
		 * 					PARA LER UMA PALAVRA DE TEXTO SEM ESPAÇO
		 * suponha uma palavra tipo String declarada:
		 * 
		 * String x = sc.next();
		 * 
		 * 					PARA LER UM NUMERO INTEIRO
		 * int x = sc.nextInt();
		 * 
		 * 					PARA LER UM NUMERO COM PONTO FLUTUANTE
		 * double x = sc.nextDouble();
		 * 
		 * 					PARA LER UM CHAR
		 * char x = sc.next().charAt(0); - vai pegar apenas o primeiro caracter do texo.
		 * 
		 * 					PARA LER VARIOS DADOS NA MESMA LINHA
		 * string x = sc.next();
		 * int y = sc.nextInt();
		 * double z = sc.nextDouble();
		 * 
		 * 					PARA LER UM TEXTO ATE A QUEBRA DE LINHA
		 * String x = sc.nextLine(); - le o texto com todos os espaços até a quebra de linha.
		 * */
		
		
		sc.close();
		
	}
	

}
