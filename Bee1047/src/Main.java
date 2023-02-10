import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int horaI, minuI, horaF, minuF;
		
		horaI = teclado.nextInt();
		minuI = teclado.nextInt();
		horaF = teclado.nextInt();
		minuF = teclado.nextInt();
		
		// passo 1 - estou transformando tudo para minutos
		int tempoI = horaI * 60 + minuI;		
		int tempoF = horaF * 60 + minuF;
		
		// passo 2 - minha duracao é o tempo final - tempo inicial
		int duracao = tempoF - tempoI;
		if (duracao <= 0) {
			duracao = duracao + 24 * 60;  // ou 1440 minutos
		}
		
		// passo 3 - voltar pra hora e minuto
		int durH = duracao / 60;
		int durM = duracao % 60;
		
		System.out.println("O JOGO DUROU "+durH+" HORA(S) E "+durM+" MINUTO(S)");
		
		
		teclado.close();
	}
}
