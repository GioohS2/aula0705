package aula_0705;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a sua Idade: ");
		int idade = ler.nextInt();
		String mensagem = idade >= 18 ? "Maior de Idade" : "Menor de Idade";
		System.out.println(mensagem);
		
		
		ler.close();

	}

}
