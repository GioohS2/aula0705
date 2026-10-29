package aula_0705;

import java.util.Scanner;

public class Ex5While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0;
		do {
			System.out.println(i++);
		} while(i < 10);
		
		ler.close();

	}

}
