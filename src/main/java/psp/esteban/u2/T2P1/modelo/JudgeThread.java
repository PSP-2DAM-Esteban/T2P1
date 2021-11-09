package psp.esteban.u2.T2P1.modelo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class JudgeThread extends Thread implements Runnable{

	private Thread caballos[];
	private Random random = new Random();
	private Set<Integer> caballosNumerosDescalificados = new HashSet<>();
	private String caballosOff= "Estos son los caballos descalificados: ";

	public JudgeThread(String name) {
		super(name);
	}

	public JudgeThread(String name, Thread[] caballos) {
		super(name);
		this.caballos = caballos;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for (int i = 0; i < 5; i++) {
			
			int numRandom = random.nextInt(9)+1;
			
			//añadimos el numero generado al array para poder descalificar a ese caballo, si el array contiene ese numero genera otro
			if (!caballosNumerosDescalificados.contains(numRandom)) {
				caballosNumerosDescalificados.add(numRandom);
				
				System.out.println(caballos[numRandom].getName() + " fue descalificado");
				//Añadimos todos los caballos descalificados a la String para mostrar la "lista"
				caballosOff+=caballos[numRandom].getName() + ", ";
				
				//paramos el caballo
				caballos[numRandom].interrupt();
			}else {
				i--;
			}
		}
		
		//mostramos la lista
		System.out.println(caballosOff);
		
	}
	
	
	
	
	
}
