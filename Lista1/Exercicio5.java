import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args){

		float cotacao_Dolar;
		float valor_Reais;
		float resultado;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a cotação do dólar atual? "); // pedindo um número inteiro 
		cotacao_Dolar = ler.nextFloat();

		System.out.println("Qual o valor você deseja converter em reais?");
		valor_Reais = ler.nextFloat();

		resultado = valor_Reais / cotacao_Dolar;
		System.out.println("O dólar em reais é:  " + resultado );





	}
}			