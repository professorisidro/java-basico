import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double distancia, consumo;
		int tempo, velocidade;
		
		System.out.println("Digite o tempo de viagem em horas ");
		tempo = teclado.nextInt();
		System.out.println("Digite a velocidade media em km/h");
		velocidade = teclado.nextInt();
		
		
		// calculando a distancia
		distancia = tempo * velocidade;
		// calculando o consumo
		consumo = distancia / 12;
		
		System.out.printf("O Carro consumiu %.3f litros de combustível\n",consumo);
		
	}

}
