package aula_0705;

import java.util.Scanner;

public class VetorExercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int vetor[] = new int [5], twovetor[] = new int [5], somaVtor = 0;
        
        for(int i = 0; i < 5; i++) {
        	System.out.println("Informe o Valor" + i + " :");
        	vetor[i] = ler.nextInt();  
        	}
        for(int i = 0; i < 5; i++) {
        	System.out.println(" Informe o Valor " + i + ":");
        	twovetor[i] = ler.nextInt();
        }
        for(int i = 0; i < 5; i++) {
        	somaVtor = vetor[i] + twovetor[i];
        }
        
        if(somaVtor > 1) {
        	System.out.println("A soma dos vetores é de: "  + somaVtor);
        }
     
		
		
		ler.close();
	}

}
