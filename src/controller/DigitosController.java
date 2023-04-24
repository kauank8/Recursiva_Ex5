package controller;

public class DigitosController {

	public int calculardigitos(String[] vt, int tamanho, int digitos) {
		//condição de parado
		if(tamanho==0) {
			return digitos;
		}else {
			tamanho--;
			return calculardigitos(vt, tamanho, digitos+1);
		}
		
	}

}
