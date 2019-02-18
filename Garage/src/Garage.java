import java.util.*;
public class Garage {

	//Veicolo [] posti = new Veicolo [15];
	ArrayList<Veicolo> posti = new ArrayList<Veicolo>();
	
	
	public void aggiungiVeicolo(Veicolo veicolo) {
		if(posti.size() == 15)
			System.out.println("Tutti i posti sono occupati");
			else
		posti.add(veicolo);
	}
	
	public void togliveicolo(int veicolo) {
		posti.remove(veicolo);
	}
	
	public void stampaVeicolo(){
		System.out.println("Attualmente nel garage ci sono: " + posti);	
	}
	
	
	
	
	
}
