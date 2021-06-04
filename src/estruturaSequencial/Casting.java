package estruturaSequencial;

public class Casting {

	public static void main(String[] args) {
		
		/*
		 * CASTING É A CONVERSÃO EXPLICITA DE UM TIPO DE DADO
		 * 
		 * int a,b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = a/b;
		
		System.out.println(resultado);
		*/
		
		//quando voce quer um resultado double de uma calculo de numeros int o compilador vai truncar as casas decimais e vai entender que voce quer o resultado int tambem.
		
		//para isso nao acontecer é necessario fazer o casting informando para o compilador que o resultado deve ser do tipo double;
		
		int a,b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a/b;
		
		System.out.println(resultado);

	}

}
