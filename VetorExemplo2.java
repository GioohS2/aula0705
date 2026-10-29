package aula_0705;

import java.util.Scanner;

public class VetorExemplo2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String a[] = new String[5];
		
		for(int i = 0; i<5; i++) {
			System.out.println("Informe um Nome " + i + "...:");
			a[i] = ler.nextLine();
		}
		for(int i = 0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		
		ler.close();

	}

}
