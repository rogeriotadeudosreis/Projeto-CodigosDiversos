import java.util.Scanner;

public class ListaExercicio3 {

	public static void main (String[]args) {
		
		//Convers�o de temperatura de F para C
		
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite a temperatura em F: ");
		double F = entrada.nextDouble();
		
		double C = 5*(F - 32)/9;
		
		System.out.printf("A temperatura em C �: %4.0f\n", C );
		entrada.close();
	}
		
}
