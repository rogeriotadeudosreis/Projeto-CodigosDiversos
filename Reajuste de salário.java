import java.util.Scanner;

public class ListaExercicio7 {

	public static void main (String []args) {
		
		//Reajuste de um salário (exercício 7 da lista 1)
				//declarar as váriaveis
											
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Informe o salário :");
		double Salario = entrada.nextDouble();		
		double SalarioReajustado = Salario*15/100 + Salario;
				
		System.out.printf("O salário reajustado é: %4.2f\n", SalarioReajustado );
		entrada.close();
		
	}
}
