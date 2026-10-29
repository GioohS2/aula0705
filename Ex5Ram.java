package aula_0705;

import java.util.Random;

public class Ex5Ram {

	public static void main(String[] args) {

		Random random = new Random();
		int faceDado;
		
		do {
		    faceDado =random.nextInt(7);
		    System.out.println("Face do Dado: " + faceDado);
		} while (faceDado !=6);
		
	
	}

}
