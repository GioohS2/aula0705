package aula_0705;

import java.util.Scanner;

public class Exemplo_1aula1405 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma nota: ");
		double nota;
		nota = ler.nextDouble();
		
		if (nota >= 6) {
			System.out.println("Aprovado");
			System.out.println("Parabéns!");
		}
		else if (nota < 6 && nota >= 4) {
			System.out.println("Ficou para o Exame");
		}
		
		else {
			System.out.println("Reprovado");
		}
		
		
        ler.close();
	}

}
