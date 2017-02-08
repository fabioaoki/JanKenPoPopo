package JanKenPoPopo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JanKenPoPopo {
	
public enum JankenPoEnum {
	PEDRA ("Pedra ", 0),
	PAPEL ("Papel ", 1),
	TESOURA ("Tesoura ", 2);
	
	String nome;
	int valor;
	
	JankenPoEnum(String nome, int valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public int getValor() {
		return valor;
	}

	public static JankenPoEnum getByValor(int valor) {
		for (JankenPoEnum item : JankenPoEnum.values()) {
			if (item.getValor() == valor) {
				return item;
			}
		}
		return null;
	}
	
}		//Testepopo4

	public static void main(String[] args) {
		Scanner lerDados = new Scanner (System.in);
		
		boolean continuar = false;
		String numEscString = null;
		int numEsc = 0;
		
		Random rand = new Random();
//		int numEsc;
		int cpu = rand.nextInt(3);
				
			System.out.println("Escolha, PEDRA-0 PAPEL-1 TESOURA-2:");
	   	    numEsc = lerDados.nextInt();
		
		switch (numEsc) {
			case 0: 
				switch (cpu) {
					case 0:
						System.out.println("Empate! Tente novamente");
						System.out.println("Jogador escolheu uma opcao " + JankenPoEnum.getByValor(numEsc).getNome());
					case 1:
						System.out.println("Você perdeu!");
						System.out.println("Jogador escolheu uma outra opcao" + JankenPoEnum.getByValor(numEsc).getNome());
						break;
					case 2:
						System.out.println("Você ganhou!");
						System.out.println("Jogador escolheu " + JankenPoEnum.getByValor(numEsc).getNome());
						break;
						default:
				}
				break;
			case 1:{
				switch (cpu) {
					case 0:
						System.out.println("Você ganhou! ");
						System.out.println("Jogador escolheu " + JankenPoEnum.getByValor(numEsc).getNome());
						break;
					case 1:
						System.out.println("Empate! Tente novamente");
						System.out.println("Jogador escolheu "  + JankenPoEnum.getByValor(numEsc).getNome());
						break;
					case 2:
						System.out.println("Você perdeu! ");
						System.out.println("Jogador escolheu " + JankenPoEnum.getByValor(numEsc).getNome());
						break;
					default:
				}
				break;
				}
		case 2:{
			switch (cpu) {
				case 0:
					System.out.println("Você perdeu!");
					System.out.println("Jogador escolheu " + JankenPoEnum.getByValor(numEsc).getNome());
					break;
				case 1:
					System.out.println("Você ganhou!");
					System.out.println("Jogador escolheu " + JankenPoEnum.getByValor(numEsc).getNome());
					break;
				case 2:
					System.out.println("Empate! Tente novamente");
					System.out.println("Jogador escolheu " + JankenPoEnum.getByValor(numEsc).getNome());
				default:
			}
			break;
		}
	}
					
	System.out.println("CPU escolheu: " + JankenPoEnum.getByValor(cpu).getNome());
			
//	    if ((numEsc >= 0 ) || (numEsc <= 2)) {
//   	System.out.println("Opção invalida! Tente novamente");
//   	System.out.println("Escolha, PEDRA-0 PAPEL-1 TESOURA-2:");
//   	numEsc = lerDados.nextInt();
//   	
//   }
			
	}

}
