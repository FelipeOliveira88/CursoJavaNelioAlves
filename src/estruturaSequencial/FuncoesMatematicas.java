package estruturaSequencial;

public class FuncoesMatematicas {

	public static void main(String[] args) {
		/*
		 * ALGUMAS FUNÇÕES MATEMATICAS:
		 * A = Math.sqrt(x) - Variavel A recebe raiz quadrada de x
		 * A = Math.pow(x,y) - Variavel A recebe o resultado de x elevado a y
		 * A = Math.abs(x) - Variavel A recebe o valor absoluto de x
		 *
		 */
			double a,b,c,x,y,z,A,B,C;
			x = 3.0;
			y = 4.0;
			z = -5.0;
			
			A = Math.sqrt(x);
			B = Math.sqrt(y);
			C = Math.sqrt(25.0);
			System.out.println("A raiz quadrada de " + x + " = " + A);
			System.out.println("A raiz quadrada de " + y + " = " + B);
			System.out.println("A raiz quadrada de 25  = " + C);
			
			A = Math.pow(x,y);
			B = Math.pow(x,2.0);
			C = Math.pow(5.0,2.0);
			System.out.println(x + " elevado a " + y + "  = " + A);
			System.out.println(x + " elevado ao quadrado = " + B);
			System.out.println("5 elevado ao quadrado = " + C);
			
			A = Math.abs(y);
			B = Math.abs(z);
			System.out.println("O valor absoluto de " + y + " = " + A);
			System.out.println("O valor absoluto de " + z + " = " + B);
			
			/*
			 * PODEMOS USAR FUNÇÕES MATEMATICAS EM EXPRESSOES COMPLEXAS COMO A FORMULA DE BASKARA
			 * 
			 * X = -b +- raiz de delta / 2*a
			 * 
			 * delta = b ao quadrado - 4 *a * c
			 * 
			 */
			a = 10.0;
			b = 25.0;
			c = 5.0;
			double delta = Math.pow(b, 2.0) - 4*a*c;
			
			double x1 = (-b + Math.sqrt(delta)) / (2.0 * a) ;
			double x2 = (-b - Math.sqrt(delta)) / (2.0 * a) ;
			
			
	}

}
