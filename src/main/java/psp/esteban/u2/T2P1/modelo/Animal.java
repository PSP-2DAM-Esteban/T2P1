package psp.esteban.u2.T2P1.modelo;

public class Animal extends Thread implements Runnable{


	private int pasosMetros;
	private int distanciaTotal;
	private int sleep;
	
	public Animal(String name) {
		super(name);
	}

	public Animal(String name, int pasosMetros, int distanciaTotal, int sleep) {
		super(name);
		this.pasosMetros = pasosMetros;
		this.distanciaTotal = distanciaTotal;
		this.sleep = sleep;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for (int i = 0; i < distanciaTotal; i+=pasosMetros) {
			
			try {
				Thread.sleep(sleep);
				System.out.println(getName() + " -> Distancia completada: " + i);
			} catch (Exception e) {
				// TODO: handle exception
				System.err.print(e);
			}
		}
		
		System.out.println(getName()+ " ha finalizado");
		
	}
	
	
	
	
}
