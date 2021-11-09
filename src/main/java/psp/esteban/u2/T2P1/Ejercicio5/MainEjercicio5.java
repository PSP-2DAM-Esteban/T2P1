package psp.esteban.u2.T2P1.Ejercicio5;

import psp.esteban.u2.T2P1.modelo.Animal;

public class MainEjercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreConejo = "Conejo ", nombreTortuga = "Tortuga ", nombreGepardo = "Gepardo ";
		int pasosMetros = 100, distanciaTotal = 3000;
		int sleep = 100;

		Animal conejo = null;
		Animal tortuga = null;
		Animal gepardo = null;

		try {

			gepardo = new Animal(nombreGepardo, pasosMetros, distanciaTotal, sleep);
			gepardo.start();

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}

		
		for (int i = 0; i < 3; i++) {

			try {

				gepardo.join();

				conejo = new Animal(nombreConejo + i, pasosMetros, distanciaTotal, sleep);
				conejo.start();

			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e);
			}

		}

		for (int i = 0; i < 4; i++) {
			try {
				conejo.join();
				tortuga = new Animal(nombreTortuga + i, pasosMetros, distanciaTotal, sleep);
				tortuga.start();
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println(e);
			}
			

		}

	}

}
