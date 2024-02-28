package primeiro_projeto;
import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variável
		double a,b,salbruto,inss,salliquido;

		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);

		//Entrada de dados
		System.out.println ("Quantas horas você trabalha por dia?");
		a = ler.nextDouble ();

		//Entrada de dados
		System.out.println ("Quanto você recebe por hora?");
		b = ler.nextDouble ();

		//Processamento
		salbruto = (a*b)*30;
		inss = salbruto*0.12;
		salliquido = salbruto - inss;

		System.out.println("O valor do salário bruto é :" + salbruto);
		System.out.println("O valor do salário líquido é :" + salliquido);

	}

}
