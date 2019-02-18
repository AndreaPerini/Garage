
public class Veicolo {

	String marca;
	int anno;
	int cilindrata;
	
	public Veicolo(String marca, int anno, int cilindrata) {
		this.marca = marca;
		this.anno = anno;
		this.cilindrata = cilindrata;
	}
	public Veicolo() {
		
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	
}
