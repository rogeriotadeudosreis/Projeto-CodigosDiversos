import java.util.Scanner;

public class ListaExercicio5 {

	public static void main (String []args) {
		
		//calcular o custo da lata de cerveja 
		// declarar as medidas da lata
			
			double pi = 3.14159;
			
			Scanner entrada = new Scanner(System.in);
			System.out.printf("Digite o raio: ");
			double raio = entrada.nextDouble();
			System.out.printf("Digite a altura: ");
			double altura = entrada.nextDouble(); 
			entrada.close();
			//Fórmula da base de um cilindro Ab=pi*r*r
			//double areabase = pi*raio*raio;
			//System.out.printf("A medida da base é: %4.4f\n", areabase);		
			//Fórmula da área lateral de um cilindro Al=altura*2pi*r
			//double arealateral = altura*2*pi*raio;
			//System.out.printf("A medida da área lateral é: %4.4f\n", arealateral);
			//Fórmula da área total do cilindro At=Al + 2*Ab
			double areatotal = altura*2*pi*raio +  pi*raio*raio*2;
			//System.out.printf("A medida da área total é: %4.4f\n", areatotal);
			double custofinal = areatotal*100.00;
			System.out.printf("O valor do custo é %4.2f\n", custofinal);
		
	}
}
