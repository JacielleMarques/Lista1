import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args){

		int ano_Atual;
		int idade;
		int resultado;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o ano atual:"); // pedindo um número inteiro 
		ano_Atual= ler.nextInt();

		System.out.println("Digite a sua idade:"); 
		idade = ler.nextInt();

		resultado = ano_Atual - idade;
		System.out.println("O ano de seu nascimento é: " + resultado);



	}
}

