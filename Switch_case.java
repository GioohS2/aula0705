package aula_0705;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escolha um número entre 1 e 3: ");
		int numero = ler.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("O número escolhido foi o 1!");
			break;
		case 2:
			System.out.println("O número escolhido foi o 2!");
			break;
			
		case 3:
			System.out.println("O número escolhido foi 3!");
			break;
			
			default:
				System.out.println("O número escolhido é inválido!");
		}
		ler.close();

	}

}
