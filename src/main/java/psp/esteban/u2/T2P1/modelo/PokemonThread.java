package psp.esteban.u2.T2P1.modelo;

public class PokemonThread extends Thread implements Runnable {

	private Thread entrenador;

	
	
	
	public PokemonThread(String nombre) {
		super(nombre);
	}


	public PokemonThread(String nombre, Thread entrenador) {
		super(nombre);
		this.entrenador = entrenador;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		entrenador.start();
		
		try {
			//Esperamos a que termine el entrenador para luego mostrar el pokemon
			entrenador.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e);
			
		}
		
		System.out.println("Soy el pokemon numero" + getName());
		
	}
	
	
	
	
	
	
}
