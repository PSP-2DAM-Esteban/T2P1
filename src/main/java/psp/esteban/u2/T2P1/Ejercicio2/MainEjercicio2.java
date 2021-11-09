package psp.esteban.u2.T2P1.Ejercicio2;

import java.util.Scanner;

import psp.esteban.u2.T2P1.modelo.PokemonThread;
import psp.esteban.u2.T2P1.modelo.TrainerThread;

public class MainEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero=0;
		TrainerThread entrenador=null;
		PokemonThread pokemon= null;
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Finaliza cuando el numero sea menor que 1");
		
		do {
			
			System.out.println("Escribe un numero");
			numero=sc.nextInt();
			
			if (numero>=1) {
				//par entrenador
				if (numero%2 == 0) {
					
					entrenador= new TrainerThread(Integer.toString(numero));
				}else {
					//Cuando creamos un pokemon verificamos si de antes tenemos entrenador
					
					if (entrenador != null) {
						//Si hay entrenador al crear el pokemos le enviamos el Thread del entrenador para ejecutarlo desde ahi.
						pokemon = new PokemonThread(Integer.toString(numero), entrenador);
						pokemon.start();
						
						
						//Esperamos al hilo del Pokemon
						try {
							pokemon.join();
						} catch (Exception e) {
							// TODO: handle exception
							System.err.print(e);
						}
						
						//Volvemos a poner al entrenador a null
						entrenador=null;
					}else {
						System.out.println("No hay ningun entrenador prueba con numero par antes");
					}
				}
				
			}
			
		} while (!(numero<=1));
		System.out.println("Game Over");
		sc.close();
	}

}
