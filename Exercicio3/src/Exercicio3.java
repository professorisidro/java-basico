import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valorSalario, valorKw, valorConta, valorLiquido;
		int    qtdKw;
		
		System.out.println("Por favor informe o valor do salario Minimo");
		valorSalario = teclado.nextDouble();
		System.out.println("Por favor informe a quantidade de KW consumidos");
		qtdKw = teclado.nextInt();
		
		// calculando o valor de 1 KW
		valorKw = valorSalario / 700;
		// calculando a conta bruta
		valorConta = valorKw * qtdKw;
		// calculando o valor liquido
		valorLiquido = valorConta - valorConta * 0.1;
		
		System.out.printf("O valor de 1KW = R$ %.2f reais\n", valorKw);
		System.out.printf("O valor total da conta R$ %.2f reais\n", valorConta);
		System.out.printf("O valor com desconto de 10%% R$ %.2f reais\n", valorLiquido);
	}
}
