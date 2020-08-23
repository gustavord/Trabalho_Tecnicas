package tecnicas;

public class Caminhao extends Veiculo{
	protected int rodas; //num de rodas
	protected double cap; //carga maxima
	
	public Caminhao(String marca, String modelo, double km, int pot, int rodas, double cap) {
		super(marca, modelo, km, pot);
		this.rodas = rodas;
		this.cap = cap;
	}
	//finalizado gett e sett
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public void setCap(double cap) {
		this.cap = cap;
	}
	public int getRodas() {
		return rodas;
	}
	public int getCap() {
		return cap;
	}
	
	public String toString() {
		return super.toString()+rodas+" rodas \n"+"Carga maxima: "+cap;
	}
}
