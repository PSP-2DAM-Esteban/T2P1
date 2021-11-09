package psp.esteban.u2.T2P1.modelo;

public class TrainerThread extends Thread implements Runnable {

	
	public TrainerThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		System.out.println("Soy el entrenador numero "+getName());
	}
	
	
	
	
}
