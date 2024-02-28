package primeiro_projeto;
import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variáveis
		double a,b,som;

		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);

		//Entrada de dados
		System.out.println ("Informe valor 1: ");
		a = ler.nextDouble ();

		//Entrada de dados
		System.out.println ("Informe valor 2: ");
		b = ler.nextDouble ();

		//Processamento
		som = a+b;
		
		//Saída
		System.out.println("O resultadp é : " + som);

		ler.close();

	}

}
