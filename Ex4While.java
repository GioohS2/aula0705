package aula_0705;

import java.util.Scanner;

public class Ex4While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        double fras = 0;
        
        while(fras < 21) {
        	System.out.println(fras++);
        	System.out.println("Eu sou JEDI em Java");
        }
		
		ler.close();
	}

}
