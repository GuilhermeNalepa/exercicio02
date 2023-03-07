package controller;

public class binarioController {
	
	public binarioController() {
		
		super();
		
	}
	
	public String binario(int valor) {
		
		//Ao dividir o valor por 2 diversas vezes resultará que ele seja 0, e quando for, retornará espaço vazio que
		//somará com a chamada da função
		if (valor <= 0) {
			
			return "";
			
		} else {
			
			int resto = valor % 2;
			valor = valor / 2;
			String converte = String.valueOf(resto);
			return binario(valor) + converte;
			//A função somará com o converte, que possui o valor do resto das divisões
			
		}
		
	}
	
}