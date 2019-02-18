import java.util.*;
public class Avvia {

	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	Garage g = new Garage();
	Veicolo v = new Veicolo();
	int b;

	boolean fine = false;
	do {
	System.out.println("Inserisci il metodo da eseguire: ");
	System.out.println("1 = Aggiungi un veicolo");
	System.out.println("2 = Rimuovi un veicolo");
	System.out.println("3 = Stampa il garage");
	System.out.println("4 = Esci");
	int a = sc.nextInt();
	switch(a) {
	case 1:
		System.out.println("Cosa vuoi inserire?");
		System.out.println("1 = Aggiungi auto");
		System.out.println("2 = Aggiungi moto");
		System.out.println("3 = Aggiungi furgone");
		b = sc.nextInt();
		switch (b) {
		case 1:
		System.out.println("Inserisci anno");
		v.setAnno(sc.nextInt());
		System.out.println("Inserisci cilindrata");
		v.setCilindrata(sc.nextInt());
		System.out.println("Inserisci Marca");
		v.setMarca(sc.nextLine());
		g.aggiungiVeicolo(v);
		break;
		}
		break;
	case 2:
		g.togliveicolo(sc.nextInt());
		break;
	case 3:
		g.stampaVeicolo();
		break;
	case 4:
		fine = true;
		break;
	}
	}while(!fine);
	sc.close();
}
	
}
