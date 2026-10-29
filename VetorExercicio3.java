package aula_0705;

import java.util.Scanner;

public class VetorExercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int[5], soma = 0;
		
		for(int i = 0; i<5; i++) {
			System.out.println("Informe o valor " + i + "...:");
			a[i] = ler.nextInt();
		}
		for(int i = 0; i<5; i++) {
			System.out.println(a[i]);
			soma = soma + a[i];
		}
		
		
		String mensagem = soma >= 15 ? "A Soma é: " + soma : " A soma deu menos que 15 :C ";
		System.out.println(mensagem); 
		
		
		
		ler.close();

	}

}
