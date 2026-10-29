package aula_0705;

import java.util.Scanner;

public class Processo_Sel {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, som, sub, mul, div;
		
		System.out.println("Insira o Valor 1: ");
		a = ler.nextDouble();
		
		System.out.println("Insira o Valor 2: ");
		b = ler.nextDouble();
		
		som = (a+b);
		sub = (a-b);
		mul = (a*b);
		div = (a/b);
		
		System.out.println("O Resultado da Soma é: " + som);
		System.out.println("O Resultado da Subtração é: " + sub);
		System.out.println("O Resultado da Multiplicação é: " + mul);
		System.out.println("O Resultdo da Divisão é: "+ div);
		
		ler.close();

	}

}
