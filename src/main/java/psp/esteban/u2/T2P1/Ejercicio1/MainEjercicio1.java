package psp.esteban.u2.T2P1.Ejercicio1;

import psp.esteban.u2.T2P1.modelo.ThreadHorse;

public class MainEjercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pasosMetros=100;
		int distanciaTotal=5000;
		int descanso= 200;
		String nombre= "Caballo ";
		
		
		//bucle para crear los threads
		
		for (int i = 0; i < 10; i++) {
			
			ThreadHorse horse= new ThreadHorse(nombre+i, pasosMetros, distanciaTotal, descanso);
			horse.start();
		}
		
	}

}
