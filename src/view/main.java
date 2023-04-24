package view;

import java.util.Random;

import controller.DigitosController;

public class main {

	public static void main(String[] args) {
		Random gerador = new Random();
		int valor = gerador.nextInt(1000000)+1;
		String valortxt = Integer.toString(valor);
		DigitosController d = new DigitosController();
		System.out.println("Numero:" + valor);
		String[] vt = valortxt.split("");
		int tamanho = vt.length;
		int digitos=0;
		digitos=d.calculardigitos(vt,tamanho,digitos);
		System.out.println("O numero de digitos foi:" + digitos);

	}

}
