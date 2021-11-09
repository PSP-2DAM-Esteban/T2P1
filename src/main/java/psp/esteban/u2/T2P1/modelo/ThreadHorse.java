package psp.esteban.u2.T2P1.modelo;

public class ThreadHorse extends Thread implements Runnable{

	
	private int pasosMetros;
	private int distanciaTotal;
	private int sleep;
	
	public ThreadHorse(String nombre) {
		super(nombre);
	}

	public ThreadHorse(String nombre, int pasosMetros, int distanciaTotal, int sleep) {
		super(nombre);
		this.pasosMetros = pasosMetros;
		this.distanciaTotal = distanciaTotal;
		this.sleep = sleep;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for (int i = 0; i < distanciaTotal; i+= pasosMetros) {
			
			try {
				
				Thread.sleep(sleep);
				System.out.println(getName() + ": "+ (distanciaTotal-i) + " metros para finalizar");
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(getName() + ": esta descalificado, abandona carrera");
			}
			
		}
		
		System.out.println(getName() + ": Ha finalizado la carrera");
		
	}
	
	
	
	
	
}
