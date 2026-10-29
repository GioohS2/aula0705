package aula_0705;

import java.util.Scanner;

public class Ex3While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int fat = 1;
		int i = 1;
		
		System.out.println("Informe o Fatorial: ");
		int n = ler.nextInt();
		
		while(i <= n) {
			fat = fat * i;
			i++;
		}
		
		System.out.println("O Fatorial é: " + fat);
		
		ler.close();

	}

}
