import java.util.Scanner;

public class ListaExercicio7 {

	public static void main (String []args) {
		
		//Reajuste de um sal�rio (exerc�cio 7 da lista 1)
				//declarar as v�riaveis
											
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Informe o sal�rio :");
		double Salario = entrada.nextDouble();		
		double SalarioReajustado = Salario*15/100 + Salario;
				
		System.out.printf("O sal�rio reajustado �: %4.2f\n", SalarioReajustado );
		entrada.close();
		
	}
}
