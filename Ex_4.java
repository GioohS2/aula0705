package aula_0705;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        
		System.out.println("Informe sua idade: ");
		int idade = ler.nextInt();
		
		String mensagem = idade >= 18 ? "Maior de Idade" : "Menor de Idade";
		
		System.out.println("A Idade é: " + mensagem );
		ler.close();
	}
      
}
