import java.util.Scanner;

public class ListaExercicio8 {

	public static void main (String [] args) {
		
		//Exercício 8, converter tempos em segundos
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.printf("informe o tempo em hora: ");
		int Hora = entrada.nextInt();
		
		System.out.printf("informe o tempo em minutos: ");
		int Min = entrada.nextInt();
		
		System.out.printf("informe o tempo em segundos: ");
		int Segundos = entrada.nextInt();
				
		int Tempo = (Hora*3600) + (Min * 60) + (Segundos);
				
		System.out.printf("O tempo em segundos é: %d\n", Tempo);
		entrada.close();
		
	}
}
