
public class Auto extends Veicolo {

	int porte;
	String alimentazione;
	
	public Auto(String marca, int anno, int cilindrata) {
		super(marca, anno, cilindrata);
		// TODO Auto-generated constructor stub
	}
	public int getPorte() {
		return porte;
	}
	public void setPorte(int porte) {
		this.porte = porte;
	}
	public String getAlimentazione() {
		return alimentazione;
	}
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	
	
}
