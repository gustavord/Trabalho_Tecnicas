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

	public void setKM(String km) {
		this.km = km;
	}

	public void setPot(int pot) {
		this.pot = pot;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getModelo(){
		return modelo;
	}
	
	public double getKm(){
		return km;
	}

	public int getPot(){
		return modelo;
	}
	// getter e setters implementados

	
	public String toString() {
		return marca+" "+modelo+"\n Quilometragem: "+km+"\n Potencia: "+pot+" cavalos \n";
	}
}
