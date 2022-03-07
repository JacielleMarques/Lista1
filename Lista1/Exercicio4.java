import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args){

		float velocidade;
		float metros_s;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite uma velocidade em km/h:"); // pedindo um número inteiro 
		velocidade= ler.nextFloat();

		metros_s = velocidade / 36;
		System.out.println("A velocidadade convertida em m/s é:  " + metros_s);



	}
}

