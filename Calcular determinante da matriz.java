import java.util.Scanner;

public class ListaExercicio4 {

	public static void main (String []args) {
		
				//Calcular a determinante da matriz
				// declarei as variaveis 
		
				Scanner entrada = new Scanner(System.in);
				System.out.printf("Digite o valor de A : ");
				double A = entrada.nextDouble();
				System.out.printf("Digite o valor de B : ");
				double B = entrada.nextDouble();
				System.out.printf("Digite o valor de C : ");
				double C = entrada.nextDouble();
				System.out.printf("Digite o valor de D : ");
				double D = entrada.nextDouble();
							
				// formula da matriz 
				double DetM = A*D - B*C; 
				
				System.out.printf("O VALOR DO DETERMINANTE É = %4.2f\n", DetM);
				entrada.close();		
			
	}
}
