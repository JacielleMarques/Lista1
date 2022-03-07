import java.util.Scanner;
public class Exercicio7{

	public static void main(String[] args){

		float valor_Premio = 780000;
		float ganhador1;
		float ganhador2; 
		float ganhador3;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("O prêmio foi dividido da seguinte forma: "); // pedindo um número inteiro 

		ganhador1 = (46 * valor_Premio) / 100;
        ganhador2 = (32 * valor_Premio) / 100;
        ganhador3 = (22 * valor_Premio) / 100;
		System.out.println("Valor total do prêmio é: " + valor_Premio );
		System.out.println("Valor do ganhador1 é:" + ganhador1);
		System.out.println("Valor do ganhador2 é:" + ganhador2);
		System.out.println("Valor do ganhador3 é:" + ganhador3);





	}
}			