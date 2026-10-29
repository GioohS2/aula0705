package aula_0705;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe sua Idade: ");
		int  idade;
		idade = ler.nextInt();
		
		if (idade <= 10) {
		System.out.println("Infantil");
		}
		else if (idade < 11 && idade >= 15) {
			System.out.println("Juvenil");
		}
		else {
			System.out.println("Aspirante");
		}
		
        ler.close();
	}

}
