package view;

import java.util.Random;
import controller.threadMatriz;

public class Main {

	public static void main(String[] args) {

		int matriz [][] = new int [3][5];
	
		
		Random numAleatorio = new Random();
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 5; coluna++) {
				matriz[linha][coluna] = numAleatorio.nextInt(15);
			}
		}
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 5; coluna++) {
				System.out.print("|"+matriz[linha][coluna]+"|");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 3; i++) {
			Thread tMatriz = new threadMatriz(matriz, i);
			tMatriz.start();
		}
		
		
		
	}

}
