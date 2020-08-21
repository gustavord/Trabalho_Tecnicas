package tecnicas;

public class Caminhao extends Veiculo{
	protected int rodas; //num de rodas
	protected double cap; //carga maxima
	
	public Caminhao(String marca, String modelo, double km, int pot, int rodas, double cap) {
		super(marca, modelo, km, pot);
		this.rodas = rodas;
		this.cap = cap;
	}
	
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public int getRodas() {
		return rodas;
	}
	
	//Implementar o resto dos getters e setters
	
	public String toString() {
		return super.toString()+rodas+" rodas \n"+"Carga maxima: "+cap;
	}
}
