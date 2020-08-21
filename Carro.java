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
	public String getCambio() {
		return cambio;
	}
	//Implementar o resto dos getters e setters
	
	public String toString() {
		return super.toString()+cambio+"\n "+tracao;
	}
}
