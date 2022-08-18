package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	
	public int fatorial(int numero) {
		//Condi��o de Parada
		if(numero <=1) {/*Colocamos <= 1, pois estamos trabalhando com
			os n�meros naturais positivos, e lembrando: 0!=1.*/
			return 1;
		} else {
			/*O n�mero multiplicado pelo fatorial do n�mero menos 1*/
			int proximo = numero - 1;
			return numero * fatorial(proximo);
		}
	}

}
