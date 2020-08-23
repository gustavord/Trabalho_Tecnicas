package tecnicas;

public class Carro extends Veiculo {
	protected String cambio; //automatica, manual...
	protected String tracao; //dianteira, traseira, 4x4...
	
	public Carro(String marca, String modelo, double km, int pot, String cambio, String tracao) {
		super(marca, modelo, km, pot);
		this.cambio = cambio;
		this.tracao = tracao;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public void setTracao(String tracao) {
		this.tracao = tracao;
	}
	//finalizado gett e sett
	public String getCambio() {
		return cambio;
	}
	public void getTracao(String tracao) {
		this.tracao = tracao;
	}
	
	
	public String toString() {
		return super.toString()+cambio+"\n "+tracao;
	}
}
