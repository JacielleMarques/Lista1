import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args){

		int num1;
		int resultado;


		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número inteiro:"); // pedindo um número inteiro 
		num1 = ler.nextInt();
		
		resultado = num1 - 1;
		System.out.println("Seu antesessor é:" + resultado);

		resultado = num1 + 1;
		System.out.printf("Seu sucessor é:" + resultado);
	}

}
 