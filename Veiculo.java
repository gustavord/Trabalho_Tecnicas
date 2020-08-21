package tecnicas;

public class Veiculo {
	protected String marca, modelo;
	protected double km; //quilometragem por litro
	protected int pot; //potencia em cavalos
	
	public Veiculo(String marca, String modelo, double km, int pot) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
		this.pot = pot;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	/*
	 * Implementar getters e setters pra todos os atributos
	 */
	
	public String toString() {
		return marca+" "+modelo+"\n Quilometragem: "+km+"\n Potencia: "+pot+" cavalos \n";
	}
}
