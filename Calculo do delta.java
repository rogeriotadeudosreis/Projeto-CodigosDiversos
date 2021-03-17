import java.util.Scanner;

public class ListaExercicio2 {

	public static void main (String []args) {
		
		//Calculo do Delta na equação de Baskara
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("digite o valor: ");
		double A = entrada.nextDouble();
		
		System.out.printf("digite o valor: ");
		double B = entrada.nextDouble();
		
		System.out.printf("digite o valor: ");
		double C = entrada.nextDouble();
		
		//fórmula do Delta
		double Delta = B * B -4 * A * C;
					
		System.out.printf("o valor de delta é: %4.2f\n", Delta);
		entrada.close();
				
	}
}
