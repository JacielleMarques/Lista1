import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args){

		int num1;
		int num2;
		int num3;
		int soma;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número inteiro:"); // pedindo um número inteiro 
		num1 = ler.nextInt();

		System.out.println("Digite o sugundo número inteiro:"); 
		num2 = ler.nextInt();

		System.out.println("Digite o terceiro número inteiro:"); 
		num3 = ler.nextInt();

		soma = num1 + num2 + num3;
		System.out.println("A soma é:" + soma);

	}
}
