package aula_0705;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero1 = 10;
		int numero2 = 20;
		
		String msg = numero1 >= numero2 ? "Maior ou Igual" : "Menor";
		
		System.out.println(msg);
		ler.close();
	}

}
