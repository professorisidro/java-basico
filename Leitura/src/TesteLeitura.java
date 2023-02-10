import java.util.Scanner;

public class TesteLeitura {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor1;
		double valor2;
		
		System.out.println("Digite um valor");
		valor1 = teclado.nextInt();
		System.out.println("Voce digitou o valor "+valor1);
		
		System.out.println("Digite outro valor");
		valor2 = teclado.nextDouble();
		System.out.println("Voce digitou o valor "+valor2);
		teclado.close();
	}
}
