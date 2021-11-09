package psp.esteban.u2.T2P1.Ejercicio4;

import psp.esteban.u2.T2P1.modelo.JudgeThread;
import psp.esteban.u2.T2P1.modelo.ThreadHorse;

public class MainEjercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pasosMetros=100;
		int distanciaTotal=5000;
		int descanso= 200;
		String nombre= "Caballo ";
		
		Thread caballos[]= new Thread[10];
		
		
		//bucle para crear los threads
		
		for (int i = 0; i < caballos.length; i++) {
			
			caballos[i]= new ThreadHorse(nombre+i, pasosMetros, distanciaTotal, descanso);
			caballos[i].start();
		}
		
		//Una vez en marcha los caballos generamos el juez y le enviamos los caballos
		
		JudgeThread juez= new JudgeThread("Juez", caballos);
		juez.start();
		
	}

}
