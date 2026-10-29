package aula_0705;

import java.util.Scanner;

public class Algoritmos_ex {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println(" Informe um número de 1 - 3: ");
		int numero  = ler.nextInt();
		
		switch (numero) {
		case 1: 
		   System.out.println(" O número é 1! ");
		   break;
		   
		case 2:
			System.out.println(" O número é 2! ");
			break;
			
		case 3:
			System.out.println(" O número é 3!");
			break;
		default:
			System.out.println("Número Inválido");
		}
		
		ler.close();
		
	}

}
