package aula_0705;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, med;
		
		System.out.println("Informe a Primeira Nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Informe a Segunda Nota: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Informe a Terceira Nota: ");
		nota3 = ler.nextDouble();
		
		System.out.println("Informe a Quarta Nota: ");
		nota4 = ler.nextDouble();
		
		med = (nota1+nota2+nota3+nota4)/4;
		
		String msg = med >= 5 ? "Aprovado" : "Reprovado";
		
		System.out.println("Sua Média é de: " + med);
		System.out.println(msg);
		ler.close();
		
		}

	}

