import java.util.Scanner;

public class ListaExercicio9 {

	public static void main (String [] args) {
		
		//Exercício9 converter tempos em anos, meses e dias
		
		Scanner entrada = new Scanner (System.in);
		System.out.printf("informe o tempo em dias:");
		double Dias = entrada.nextDouble();
		//dividi os dias por 365 dias encontro anos
		double Ano =  (Dias /365);
		//dividi o resto por 30 dias encontro meses
		double Meses = (Dias %365)/30;
		//o resto é dias
		double dias = (Dias %365)%30;
						
		System.out.printf("O Valor em dias equivale a %.0f ano(s) %.0f meses %.0f dias  ",Ano, Meses, dias);
		entrada.close();
	}
}
