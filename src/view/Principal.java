package view;

import controller.binarioController;

public class Principal {
	
	public static void main(String[] args) {
		
		binarioController sc = new binarioController();
		
		int n = 26;
		String binario = sc.binario(n);
		
		System.out.println("Conversão = " + binario);
		
	}
	
}