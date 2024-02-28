package primeiro_projeto;
import java.util.Scanner;
public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variáveis
		String a,b;
		
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println ("Qual é o seu nome? : ");
		a = ler.next ();
		
		//Entrada de dados
		System.out.println ("Quantos anos você tem? : ");
		b = ler.next ();
		
		//Saída
		System.out.println("Seu nome e sua idade é: " + a +" "+ b);
		
		ler.close();

	}

}
