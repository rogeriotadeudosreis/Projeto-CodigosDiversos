import java.util.Scanner;

public class ListaExercicio10 {

	public static void main (String [] args) {
		
		//Calcular o digito verificador de um CPF
		
		Scanner entrada = new Scanner (System.in);
		System.out.printf("Digite primeiro dígito de seu CPF:");
		int dig1 = entrada.nextInt();
		System.out.printf("Digite segundo dígito de seu CPF:");
		int dig2 = entrada.nextInt();
		System.out.printf("Digite terceiro dígito de seu CPF:");
		int dig3 = entrada.nextInt();
		System.out.printf("Digite quarto dígito de seu CPF:");
		int dig4 = entrada.nextInt();
		System.out.printf("Digite quinto dígito de seu CPF:");
		int dig5 = entrada.nextInt();
		System.out.printf("Digite sexto dígito de seu CPF:");
		int dig6 = entrada.nextInt();
		System.out.printf("Digite sétimo dígito de seu CPF:");
		int dig7 = entrada.nextInt();
		System.out.printf("Digite oitavo dígito de seu CPF:");
		int dig8 = entrada.nextInt();
		System.out.printf("Digite nono dígito de seu CPF:");
		int dig9 = entrada.nextInt();
	
		//declarei as entradas acima
		//declarei essa constant valendo 11
		int Const = 11;
		
		//calculei o resto, identificando o primeiro digito verificador		
		int Calcdig1 = (dig1*10 + dig2*9 + dig3*8 + dig4*7 + dig5*6 + dig6*5 + dig7*4 + dig8*3 + dig9*2)%11;
		int Dig10 = Const - Calcdig1;
		//repetindo a operação para identificar o segundo digito verificador
		int Calcdig2 = (dig1*11 + dig2*10 + dig3*9 + dig4*8 + dig5*7 + dig6*6 + dig7*5 + dig8*4 + dig9*3 + Dig10*2)%11;
		int Dig11 = Const - Calcdig2;	
		//print no cpf completo
		//int CpfCompl =  dig1, dig2, dig3, dig4, dig5, dig6, dig7, dig8, dig9 ;
		System.out.printf("O CPF completo é: %d %d %d %d %d %d %d %d %d %d %d ", dig1, dig2, dig3, dig4, dig5, dig6, dig7, dig8, dig9, Dig10, Dig11);
					
		entrada.close();
		
	}
}
 