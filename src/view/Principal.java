package view;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		FatorialController fCont = new FatorialController();
		//int numero = 0;TESTE
		//int numero = 1;TESTE
		int numero = 5;
		int fatorial = fCont.fatorial(numero);
		System.out.println(fatorial);
	}

}
