package controller;

public class threadMatriz extends Thread {

	private int matriz[][], i;
	
	public threadMatriz(int matriz[][], int i) {
		this.matriz = matriz;
		this.i = i;
	}
	
	public void run() {
		calcularLinha();
	}
	
	public void calcularLinha() {
		switch(i) {
		case 0:
			primeiraLinha();
			break;
		case 1:
			segundaLinha();
			break;
		case 2:
			terceiraLinha();
			break;
		}
	}
	
	public void primeiraLinha() {
		int L1[] = new int[5];
		int soma = 0;
		
		for(int L = 0; L < 1; L++) {
			for(int C = 0; C < 5; C++) {
				L1[C] = matriz[L][C]; 
			}
		}
		
		for(int i = 0; i < 5; i++) {
			soma += L1[i];
		}
		System.out.println("#" + getId() + " | Linha 1 | " + "Soma: " + soma);
	}
	
	public void segundaLinha() {
		int L2[] = new int[5];
		int soma = 0;
		
		for(int L = 1; L < 2; L++) {
			for(int C = 0; C < 5; C++) {
				L2[C] = matriz[L][C]; 
			}
		}
		
		
		for(int i = 0; i < 5; i++) {
			soma += L2[i];
		}
		System.out.println("#" + getId() + " | Linha 2 | " + "Soma: " + soma);
	}
	
	public void terceiraLinha() {
		int L3[] = new int[5];
		int soma = 0;
		
		for(int L = 2; L < 3; L++) {
			for(int C = 0; C < 5; C++) {
				L3[C] = matriz[L][C]; 
			}
		}
		
		
		for(int i = 0; i < 5; i++) {
			soma += L3[i];
		}
		System.out.println("#" + getId() + " | Linha 3 | " + "Soma: " + soma);
	}
		
		
}

