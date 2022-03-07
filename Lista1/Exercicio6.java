import java.util.Scanner;
public class Exercicio6{

	public static void main(String[] args){

		float celsius;
		float fahrenheit;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um grau celsius: "); // pedindo um número inteiro 
		celsius = ler.nextFloat();

		fahrenheit = celsius * (9 / 5 ) + 32;
		System.out.println("O graus celsius converdido em fahrenheit é :  " + fahrenheit );





	}
}			