package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int fatorial(int numero) {
		//Condição de Parada
		if(numero <=1) {/*Colocamos <= 1, pois estamos trabalhando com
			os números naturais positivos, e lembrando: 0!=1.*/
			return 1;
		} else {
			/*O número multiplicado pelo fatorial do número menos 1*/
			int proximo = numero - 1;
			return numero * fatorial(proximo);
		}
	}

}
