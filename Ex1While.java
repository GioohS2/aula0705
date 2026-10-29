package aula_0705;

import java.util.Scanner;

public class Ex1While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int i = 0;
        
        while(i < 5) {
        	System.out.println(i++);
        }
		
		ler.close();
	}

}
