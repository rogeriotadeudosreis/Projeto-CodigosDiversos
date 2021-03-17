import java.util.Scanner;

public class ListaExercicio6 {

	public static void main (String []args) {
		//Calcular a locação de uma charrete
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite as horas utilizadas:");
		double Horas = entrada.nextDouble();
		//double DiferencaDoInteiro = (Horas%3);
		double ValorApagar = (Horas-Horas%3)/3*10 + (Horas%3*5.00);
		System.out.printf("O valor a pagar é: %4.2f\n", ValorApagar);
		entrada.close();
		
	}
	
}
