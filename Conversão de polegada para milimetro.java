import java.util.Scanner;

public class ListaExercicio1 {
	
	public static void main (String []args) {
	Scanner entrada = new Scanner(System.in);
	System.out.printf("Digite um valor em polegadas: ");
	double polegadas = entrada.nextDouble();
	
	double ml = polegadas * 25.4;
	
	System.out.printf("O valor convertido em milimetros é: %4.1f", ml);
	entrada.close();
	}
	
}
