package aula_0705;

import java.util.Scanner; class Ex2While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int numero = 0;
        
        while(numero <= 20) {
        	System.out.println(numero);
        	numero = numero+ 4;
        }
		
		ler.close();
	}

}
